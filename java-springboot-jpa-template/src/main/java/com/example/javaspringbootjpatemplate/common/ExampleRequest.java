package com.example.javaspringbootjpatemplate.common;

import lombok.*;

@Getter
@Builder
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ExampleRequest<T> {

    private T dataBody;
    
}
