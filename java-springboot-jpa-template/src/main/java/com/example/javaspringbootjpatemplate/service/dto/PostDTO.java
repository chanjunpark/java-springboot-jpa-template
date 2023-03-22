package com.example.javaspringbootjpatemplate.service.dto;

import com.example.javaspringbootjpatemplate.domain.Comment;
import lombok.Builder;

import java.util.List;

public class PostDTO {
    
    public static class inquiry {
    
        public record In(String id) {}
    
        @Builder
        public record Out(String postId, List<Comment> grid) {}
    
    }
    
    public static class register {
        
        public record In() {}
    
        @Builder
        public record Out() {}
        
    }
    
}
