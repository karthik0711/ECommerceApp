package com.example.sampleecommerce.services;

import com.example.sampleecommerce.models.User;
import com.example.sampleecommerce.repository.UserRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Getter
@Setter
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User createUser(String name, String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return user;
    }
    public Optional<User> getUserByName(String name) {
        return userRepository.findByName(name);
    }
}
