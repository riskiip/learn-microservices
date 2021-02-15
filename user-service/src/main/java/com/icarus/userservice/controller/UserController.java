package com.icarus.userservice.controller;

import com.icarus.userservice.model.User;
import com.icarus.userservice.service.UserService;
import com.icarus.userservice.valueobject.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        Logger logger = Logger.getLogger(this.getClass().getName());
        logger.info("Inside User Controller with saveUser method");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplate findUserWithDepartment(@PathVariable("id") Long userId) {
        return userService.findUserWithDepartment(userId);
    }
}
