package com.jresoluctions.financial.repositories;

import com.jresoluctions.financial.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
