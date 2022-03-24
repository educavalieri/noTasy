package com.cavalieri.noTasy.repositories;

import com.cavalieri.noTasy.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
