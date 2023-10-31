package com.varun.socialmedia.services;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import org.apache.catalina.LifecycleState;

import java.time.LocalDate;
import java.util.List;


@Entity(name="user_details")
public class User
{
    @Id
    @GeneratedValue
    private Integer id;
    @Size(min=2)
    private String name;
    @Past
    private LocalDate bday;



    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    public User(Integer id, String name, LocalDate bday) {
        this.id = id;
        this.name = name;
        this.bday = bday;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBday() {
        return bday;
    }

    public void setBday(LocalDate bday) {
        this.bday = bday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bday=" + bday +
                '}';
    }
}
