package com.alexanderneumann.springproductorderrestfulapi.services;

import com.alexanderneumann.springproductorderrestfulapi.models.Order;
import com.alexanderneumann.springproductorderrestfulapi.repositorys.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(int id) {
        return orderRepository.findById(id).orElse(null);
    }

    public void createOrder(Order order) {
        orderRepository.save(order);
    }

    public void updateOrder(int id, Order order) {
        Order existingOrder = orderRepository.findById(id).orElse(null);
        if (existingOrder == null) {
            throw new IllegalArgumentException("Order not found");
        }
        existingOrder.setProduct(order.getProduct());
        existingOrder.setQuantity(order.getQuantity());
        existingOrder.setTotalPrice(order.getTotalPrice());
        orderRepository.save(existingOrder);
    }

    public void deleteOrder(int id) {
        Order existingOrders = orderRepository.findById(id).orElse(null);
        if (existingOrders == null) {
            throw new IllegalArgumentException("Order not found");
        }
        orderRepository.deleteById(id);
    }
}
