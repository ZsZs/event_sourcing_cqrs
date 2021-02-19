package com.agilerenovation.playground.microservices.demo.domain.order;

import com.agilerenovation.playground.microservices.demo.domain.order.commands.CreateOrderCommand;
import com.agilerenovation.playground.microservices.demo.domain.order.commands.OrderCommand;
import com.agilerenovation.playground.microservices.demo.domain.order.events.OrderCreatedEvent;
import io.eventuate.Event;
import io.eventuate.EventUtil;
import io.eventuate.ReflectiveMutableCommandProcessingAggregate;

import java.util.List;

public class Order extends ReflectiveMutableCommandProcessingAggregate<Order, OrderCommand> {
    private String customer;
    private List<OrderLine> items;

    // region process commands
    public List<Event> process(CreateOrderCommand command ) {
        return EventUtil.events( new OrderCreatedEvent( command.getCustomer() ));
    }
    // endregion

    // region apply events
    public void apply( OrderCreatedEvent event ) {

    }
    // endregion
}
