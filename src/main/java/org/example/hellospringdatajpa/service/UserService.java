package org.example.hellospringdatajpa.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.hellospringdatajpa.repository.UserRepository;
import org.example.hellospringdatajpa.entity.MyUser;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<MyUser> findAllUsers() {
        return userRepository.findAll();
    }
}
