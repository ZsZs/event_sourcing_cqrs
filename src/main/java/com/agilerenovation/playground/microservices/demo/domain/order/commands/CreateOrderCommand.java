package com.agilerenovation.playground.microservices.demo.domain.order.commands;

public class CreateOrderCommand implements OrderCommand {
    public String customer;

    public CreateOrderCommand(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }
}
