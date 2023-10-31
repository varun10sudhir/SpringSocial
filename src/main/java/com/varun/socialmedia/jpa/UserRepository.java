package com.varun.socialmedia.jpa;

import com.varun.socialmedia.services.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>
{

}
