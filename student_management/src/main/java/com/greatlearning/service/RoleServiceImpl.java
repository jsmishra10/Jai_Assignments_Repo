package com.greatlearning.service;


import com.greatlearning.dao.RoleRepository;
import com.greatlearning.dao.UserRepository;
import com.greatlearning.entity.Role;
import com.greatlearning.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;


    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }
}
