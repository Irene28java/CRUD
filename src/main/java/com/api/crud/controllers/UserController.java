package com.api.crud.controllers;

import ch.qos.logback.core.pattern.parser.OptionTokenizer;
import com.api.crud.models.UserModel;
import com.api.crud.services.UserService;
import com.sun.net.httpserver.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ArrayList<UserModel> getUser() {
        return this.userService.getUsers();
    }

    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user) {
        return this.userService.saveUser(user);
    }

    @GetMapping(path = "/{íd}")
    public Optional<UserModel> getUserById(@PathVariable("id") Long Id) {
        return this.userService.getById(Id);
    }

    @PutMapping(path = "/{íd}")
    public UserModel updateUserById(@RequestBody UserModel request, @PathVariable("id") Long id) {
        return this.userService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        boolean OK = this.userService.deleteUser(id);

        if (OK) {
            return "User with id " + id + "deleted";
        } else {
            return "Error, we have a problem and can´t delete the relead user" + id;
        }


    }

}

