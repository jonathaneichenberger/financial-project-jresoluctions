package com.jresoluctions.financial.repositories;

import com.jresoluctions.financial.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
