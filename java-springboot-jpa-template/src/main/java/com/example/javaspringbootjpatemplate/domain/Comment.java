package com.example.javaspringbootjpatemplate.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
@IdClass(CommentPK.class)
public class Comment {
    
    @Id
    private String postId;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String commentId;
    
    private String content;
    
    private LocalDate uploadDate;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "postId", insertable = false, updatable = false)
    @ToString.Exclude
    private Post post;
    
    @Builder
    public Comment(final String postId, final String commentId, final String content, final LocalDate uploadDate, final Post post) {
        this.postId = postId;
        this.commentId = commentId;
        this.content = content;
        this.uploadDate = uploadDate;
    }
}
