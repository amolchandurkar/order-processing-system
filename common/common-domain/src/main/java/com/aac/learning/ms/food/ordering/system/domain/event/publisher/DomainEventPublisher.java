package com.aac.learning.ms.food.ordering.system.domain.event.publisher;

import com.aac.learning.ms.food.ordering.system.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {

    void publish(T domainEvent);
}
