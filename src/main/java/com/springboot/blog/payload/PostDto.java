package com.springboot.blog.payload;

import lombok.Data;

import java.util.Set;

@Data // internally generates getter, setters for all the fields
public class PostDto {
    private long id;
    private String title;
    private String description;
    private String content;
    private Set<CommentDto> comments;

}
