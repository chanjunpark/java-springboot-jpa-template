package com.example.javaspringbootjpatemplate.service;

import com.example.javaspringbootjpatemplate.domain.Comment;
import com.example.javaspringbootjpatemplate.domain.Post;
import com.example.javaspringbootjpatemplate.infra.CommentRepository;
import com.example.javaspringbootjpatemplate.infra.PostRepository;
import com.example.javaspringbootjpatemplate.service.dto.PostDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class PostService {
    
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    @Transactional
    public PostDTO.inquiry.Out getPost(PostDTO.inquiry.In request) {
    
//        final List<Comment> commentsByPostId = commentRepository.findCommentsByPostId(request.id());
//
//        commentsByPostId.stream().forEach(el -> System.out.println(el.getPostId() + " || " + el.getPost().getContent() + " || " + el.getCommentId()));
//
//        final List<Comment> commentsByPostIdV2 = commentRepository.findCommentsByPostIdFetch(request.id());
//
//        commentsByPostIdV2.stream().forEach(el -> System.out.println(el.getPostId() + " || " + el.getPost().getContent() + " || " + el.getCommentId()));
    
        final List<Comment> comments = commentRepository.findAll();
        comments.stream().forEach(el -> System.out.println(el.getPostId() + " || " + el.getPost().getContent() + " || " + el.getCommentId()));
    
        final List<Comment> commentsByFetchJoin = commentRepository.findAllCommentsByFetchJoin();
        commentsByFetchJoin.stream().forEach(el -> System.out.println(el.getPostId() + " || " + el.getPost().getContent() + " || " + el.getCommentId()));
    
        return PostDTO.inquiry.Out.builder()
            .postId("1")
            .grid(comments)
            .build();
    }
    
    @Transactional
    public PostDTO.register.Out savePost(PostDTO.register.In request) {
        return null;
    }
}
