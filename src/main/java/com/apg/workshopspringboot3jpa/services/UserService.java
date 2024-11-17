package com.apg.workshopspringboot3jpa.services;

import com.apg.workshopspringboot3jpa.entities.User;
import com.apg.workshopspringboot3jpa.repositorie.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}
