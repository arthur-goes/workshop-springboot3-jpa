package com.apg.workshopspringboot3jpa.repositorie;

import com.apg.workshopspringboot3jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
