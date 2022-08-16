package com.aac.learning.ms.food.ordering.system.domain.event;

public interface DomainEvent<T> {
    void fire();
}
