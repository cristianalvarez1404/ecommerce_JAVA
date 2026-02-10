package com.zosh.service.impl;

import com.zosh.domain.USER_ROLE;
import com.zosh.modal.User;
import com.zosh.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DatainitializationComponent implements CommandLineRunner {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args){
        initializeAdminUser();
    }

    private void initializeAdminUser(){
        String adminUsername = "coding@example.com";

        if(userRepository.findByEmail(adminUsername) == null){
            User adminUser = new User();

            adminUser.setPassword(passwordEncoder.encode("password"));
            adminUser.setFullName("Joe");
            adminUser.setEmail(adminUsername);
            adminUser.setRole(USER_ROLE.ROLE_ADMIN);

            userRepository.save(adminUser);
        }
    }

}
