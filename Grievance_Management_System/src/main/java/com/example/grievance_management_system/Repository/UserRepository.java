package com.example.grievance_management_system.Repository;

import com.example.grievance_management_system.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long>
{
}