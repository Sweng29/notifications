package com.notifications.notifications.controller;

import com.notifications.notifications.entity.User;
import com.notifications.notifications.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/legal")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        if (userService.getAll() != null) {
            return userService.getAll();
        }
        return null;
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable(value = "id") Long id) {
        if (userService.getById(id) != null) {
            return userService.getById(id);
        }
        return null;
    }

    @PostMapping("/users")
    public List<User> saveUser(@Valid @RequestBody User user) {
        userService.saveOrUpdate(user);
        return userService.getAll();
    }

    @DeleteMapping("/users/{id}")
    public List<User> deleteUserById(@PathVariable(value = "id") Long id) {
        userService.deleteById(id);
        return userService.getAll();
    }

}
