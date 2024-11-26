package com.jresoluctions.financial.repositories;

import com.jresoluctions.financial.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
