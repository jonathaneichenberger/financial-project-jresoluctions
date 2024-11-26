package com.jresoluctions.financial.repositories;

import com.jresoluctions.financial.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
