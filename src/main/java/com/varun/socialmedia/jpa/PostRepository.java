package com.varun.socialmedia.jpa;

import com.varun.socialmedia.services.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {
}
