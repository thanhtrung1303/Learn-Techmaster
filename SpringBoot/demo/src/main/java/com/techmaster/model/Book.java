package com.techmaster.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
    private String id;
    private String title;
    private String author;
    private int year;
}
