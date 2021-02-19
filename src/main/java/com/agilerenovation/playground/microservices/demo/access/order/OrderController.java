package com.agilerenovation.playground.microservices.demo.access.order;

import com.agilerenovation.playground.microservices.demo.businessservice.order.ManageOrders;
import com.agilerenovation.playground.microservices.demo.domain.order.Order;
import com.agilerenovation.playground.microservices.demo.domain.order.commands.CreateOrderCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired private ManageOrders manageOrders;

    @GetMapping
    public List<Order> getAllOrders(){
        return manageOrders.findAllOrders();
    }

    @PostMapping @ResponseStatus( HttpStatus.CREATED )
    public void createOrder(@RequestBody String customer ){
        manageOrders.createOrder( customer );
    }
}
