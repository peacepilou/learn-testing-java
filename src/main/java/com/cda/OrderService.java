package com.cda;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository repo;

    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    public Order create(String customer) {
        Order order = new Order(customer);
        order.setStatus("VALIDATED");
        return repo.save(order);
    }

    public Order get(Long id) {
        return repo.findById(id).orElseThrow();
    }
}