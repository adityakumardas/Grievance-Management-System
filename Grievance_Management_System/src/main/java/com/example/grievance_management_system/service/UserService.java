package com.example.grievance_management_system.service;

import com.example.grievance_management_system.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService
{

    User createByUSER_ID(String USER_ID);

    User createOrUpdate(User user);

    Iterable<User> listAll();
}