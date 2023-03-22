package com.example.javaspringbootjpatemplate.common;

import lombok.*;

@Getter
@Builder
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ExampleResponse<T> {
    
    private T dataBody;

}
