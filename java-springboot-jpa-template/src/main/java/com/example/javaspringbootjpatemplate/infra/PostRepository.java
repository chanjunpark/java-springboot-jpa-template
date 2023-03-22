package com.example.javaspringbootjpatemplate.infra;

import com.example.javaspringbootjpatemplate.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, String> {

}
