package com.agilerenovation.playground.microservices.demo.domain.order;

import io.eventuate.Event;
import io.eventuate.EventEntity;

@EventEntity(entity = "com.agilerenovation.playground.microservices.demo.domain.order.Order")
public interface OrderEvent extends Event {
}
