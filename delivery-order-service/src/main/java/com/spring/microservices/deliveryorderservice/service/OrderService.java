package com.spring.microservices.deliveryorderservice.service;

import com.spring.microservices.deliveryorderservice.model.Order;
import com.spring.microservices.deliveryorderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order save(@Validated Order order) {
        return orderRepository.save(order);
    }

    public Order findById(Integer id){
        return orderRepository.findById(id).orElse(null);
    }

    public Iterable<Order> findAll(){
        return orderRepository.findAll();
    }

    public void delete(Integer id) {
        orderRepository.deleteById(id);
    }
}
