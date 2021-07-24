package com.renzothenoob.democrud.controller;

import com.renzothenoob.democrud.entity.User;
import com.renzothenoob.democrud.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/read")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping("/create")
    public List<User> postUser(@RequestBody User user){

        return userService.postUser(user);

    }

    @PutMapping("/update")
    public List<User> putUser(@RequestBody User user){

        return userService.putUser(user);
    }

    @DeleteMapping("/delete")
    public List<User> deleteUser(@RequestBody User user){

        return userService.deleteUser(user);
    }
}
