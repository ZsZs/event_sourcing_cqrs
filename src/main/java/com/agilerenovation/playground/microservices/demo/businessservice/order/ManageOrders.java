package com.agilerenovation.playground.microservices.demo.businessservice.order;

import com.agilerenovation.playground.microservices.demo.domain.order.Order;
import com.agilerenovation.playground.microservices.demo.domain.order.commands.CreateOrderCommand;
import com.agilerenovation.playground.microservices.demo.domain.order.commands.OrderCommand;
import io.eventuate.AggregateRepository;
import io.eventuate.EntityWithIdAndVersion;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ManageOrders {
    private final AggregateRepository<Order, OrderCommand > orderRepository;

    public ManageOrders(AggregateRepository<Order, OrderCommand> orderRepository) {
        this.orderRepository = orderRepository;
    }

    public CompletableFuture<EntityWithIdAndVersion<Order>> createOrder(String customer ) {
        return orderRepository.save( new CreateOrderCommand( customer ));
    }

    public List<Order> findAllOrders() {
        return Collections.emptyList();
    }
}
