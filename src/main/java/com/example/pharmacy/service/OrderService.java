package com.example.pharmacy.service;

import com.example.pharmacy.model.Order;

import java.util.List;

public interface OrderService {
    Order completeOrder(Long customerId);

    List<Order> getOrdersHistory(Long customerId);
}
