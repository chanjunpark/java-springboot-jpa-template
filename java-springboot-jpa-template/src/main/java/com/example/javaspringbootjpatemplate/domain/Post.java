package com.example.javaspringbootjpatemplate.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
public class Post {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String postId;
    
    private String content;
    
    @Builder
    public Post(final String postId, final String content) {
        this.postId = postId;
        this.content = content;
    }
    
}
