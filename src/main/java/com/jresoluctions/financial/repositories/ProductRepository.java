package com.jresoluctions.financial.repositories;

import com.jresoluctions.financial.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
