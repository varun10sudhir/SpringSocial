package com.varun.socialmedia.services;

import org.hibernate.annotations.Comment;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDAO
{
    private static List<User> users = new ArrayList<>();
    private static int count = 0;
    static
    {
        users.add(new User(++count,"Varun", LocalDate.now().minusYears(30)));
        users.add(new User(++count,"Uma", LocalDate.now().minusYears(30)));
        users.add(new User(++count,"Sudhir",LocalDate.now().minusYears(25)));
    }

    public List<User> findAll()
    {
        return users;
    }

    public User save(User user)
    {
        user.setId(++count);
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public void deleteById(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }
}
