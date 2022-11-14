package com.example.grievance_management_system.service;

import com.example.grievance_management_system.Repository.UserRepository;
import com.example.grievance_management_system.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserRepository userRepo;

    @Override
    public User createByUSER_ID(String USER_ID)
    {
        User user = new User();
        return userRepo.save(user);
    }

    @Override
    public User createOrUpdate(User user)
    {
        return userRepo.save(user);
    }

    @Override
    public Iterable<User> listAll()
    {
        return userRepo.findAll();
    }

    }
