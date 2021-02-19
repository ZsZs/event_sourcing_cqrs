package com.agilerenovation.playground.microservices.demo.domain.order.events;

import com.agilerenovation.playground.microservices.demo.domain.order.OrderEvent;

public class OrderCreatedEvent implements OrderEvent {
    private String customer;
    public OrderCreatedEvent(String customer) {
        this.customer = customer;
    }
}
