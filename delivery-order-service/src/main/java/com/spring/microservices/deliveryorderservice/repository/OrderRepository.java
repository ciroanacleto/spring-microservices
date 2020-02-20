package com.spring.microservices.deliveryorderservice.repository;

import com.spring.microservices.deliveryorderservice.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
