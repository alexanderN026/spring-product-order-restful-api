package com.alexanderneumann.springproductorderrestfulapi.repositorys;

import com.alexanderneumann.springproductorderrestfulapi.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
