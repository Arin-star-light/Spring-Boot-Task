package com.arin.task.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostRequestBodyDto {
    private String name;
    private String category;
    private String text;
    private String date;
    private String time;
}