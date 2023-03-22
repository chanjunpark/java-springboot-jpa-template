package com.example.javaspringbootjpatemplate.infra;

import com.example.javaspringbootjpatemplate.domain.Comment;
import com.example.javaspringbootjpatemplate.domain.CommentPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, CommentPK> {
    
    List<Comment> findCommentsByPostId(String postId);
    
    @Query("SELECT c FROM Comment c INNER JOIN FETCH c.post WHERE c.postId = :id")
    List<Comment> findCommentsByPostIdFetch(@Param("id") String postId);
    
    List<Comment> findAll();
    
    @Query("SELECT c FROM Comment c INNER JOIN FETCH c.post")
    List<Comment> findAllCommentsByFetchJoin();
    
}
