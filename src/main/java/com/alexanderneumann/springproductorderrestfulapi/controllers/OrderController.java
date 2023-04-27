package com.alexanderneumann.springproductorderrestfulapi.controllers;

import com.alexanderneumann.springproductorderrestfulapi.models.Order;
import com.alexanderneumann.springproductorderrestfulapi.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class OrderController {
    private OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getAllOrder() {
        return orderService.getAllOrders();
    }

    @GetMapping("/orders/{id}")
    public Order getOrderById(@PathVariable int id) {
        return orderService.getOrderById(id);
    }

    @PostMapping("/orders")
    public void createOrder(@RequestBody Order order) {
        orderService.createOrder(order);
    }

    @PutMapping("/orders/{id}")
    public void updateOrder(@PathVariable int id, @RequestBody Order order) {
        orderService.updateOrder(id, order);
    }

    @DeleteMapping("/orders/{id}")
    public void deleteOrder(@PathVariable int id) {
        orderService.deleteOrder(id);
    }
}
