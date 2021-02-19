package com.agilerenovation.playground.microservices.demo;

import com.agilerenovation.playground.microservices.demo.businessservice.order.ManageOrders;
import com.agilerenovation.playground.microservices.demo.domain.order.Order;
import com.agilerenovation.playground.microservices.demo.domain.order.commands.OrderCommand;
import io.eventuate.javaclient.spring.EnableEventHandlers;
import io.eventuate.sync.AggregateRepository;
import io.eventuate.sync.EventuateAggregateStore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableEventHandlers
public class DemoConfiguration {
    @Bean
    public ManageOrders manageOrders(AggregateRepository<Order, OrderCommand> orderRepository ){
        return new ManageOrders( orderRepository );
    }

    @Bean
    AggregateRepository<Order, OrderCommand> orderRepository(EventuateAggregateStore eventStore ){
        return new AggregateRepository<>(Order.class, eventStore );
    }
}
