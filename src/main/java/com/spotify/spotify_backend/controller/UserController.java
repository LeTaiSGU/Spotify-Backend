package com.spotify.spotify_backend.controller;

import com.spotify.spotify_backend.model.Users;
import com.spotify.spotify_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<Users> user(){
        return userService.getAllUsers();
    }

    @PostMapping("/user")
    public Users createUser(Users user){
        return userService.createUser(user);
    }


}
