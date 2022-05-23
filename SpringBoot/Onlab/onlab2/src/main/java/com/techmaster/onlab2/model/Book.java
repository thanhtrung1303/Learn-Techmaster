package com.techmaster.onlab2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Book {
    private String id;
    private String title;
    private String author;
    private int year;
}
