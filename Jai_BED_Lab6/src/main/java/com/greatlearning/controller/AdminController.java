package com.greatlearning.controller;

import com.greatlearning.entity.Role;
import com.greatlearning.entity.User;
import com.greatlearning.service.RoleService;
import com.greatlearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;


    @PostMapping("/user/save")
    public void saveUserDetails(@RequestBody User user) {
        userService.save(user);
    }

    @PostMapping("/role/save")
    public void saveRoleDetails(@RequestBody Role role) {
        roleService.save(role);
    }
}
