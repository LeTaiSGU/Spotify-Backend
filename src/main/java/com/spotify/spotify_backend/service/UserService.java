package com.spotify.spotify_backend.service;

import com.spotify.spotify_backend.model.Users;
import com.spotify.spotify_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    // Lấy User theo ID
    public Optional<Users> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Users createUser(Users user) {
        if (userRepository.existsByUserName(user.getUserName())) {
            throw new RuntimeException("UserName đã tồn tại!");
        }
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email đã tồn tại!");
        }
        return userRepository.save(user);
    }

}
