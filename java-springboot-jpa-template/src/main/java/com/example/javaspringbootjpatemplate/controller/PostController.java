package com.example.javaspringbootjpatemplate.controller;

import com.example.javaspringbootjpatemplate.common.ExampleRequest;
import com.example.javaspringbootjpatemplate.common.ExampleResponse;
import com.example.javaspringbootjpatemplate.service.PostService;
import com.example.javaspringbootjpatemplate.service.dto.PostDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/post")
public class PostController {
    
    private final PostService service;
    
    @GetMapping("/")
    public ExampleResponse<PostDTO.inquiry.Out> inquiry(@RequestBody final ExampleResponse<PostDTO.inquiry.In> request) {
    
        final PostDTO.inquiry.Out result = service.getPost(request.getDataBody());
    
        return ExampleResponse.<PostDTO.inquiry.Out>builder()
            .dataBody(result)
            .build();
    }
    
    @PostMapping("/register")
    public ExampleResponse<PostDTO.inquiry.Out> register(@RequestBody final ExampleResponse<PostDTO.inquiry.In> request) {
        return null;
    }

}
