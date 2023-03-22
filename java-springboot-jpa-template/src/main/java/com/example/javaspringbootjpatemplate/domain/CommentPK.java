package com.example.javaspringbootjpatemplate.domain;

import lombok.Builder;

import java.io.Serializable;
import java.util.Objects;

public class CommentPK implements Serializable {
    
    public static final long serialVersionUID = 1L;
    
    private String postId;
    private String commentId;
    
    public CommentPK() {
    }
    
    @Builder
    public CommentPK(final String postId, final String commentId) {
        this.postId = postId;
        this.commentId = commentId;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        final CommentPK commentPK = (CommentPK) o;
        
        if (!Objects.equals(postId, commentPK.postId)) return false;
        return Objects.equals(commentId, commentPK.commentId);
    }
    
    @Override
    public int hashCode() {
        int result = postId != null ? postId.hashCode() : 0;
        result = 31 * result + (commentId != null ? commentId.hashCode() : 0);
        return result;
    }
}
