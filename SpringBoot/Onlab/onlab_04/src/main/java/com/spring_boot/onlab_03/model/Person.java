package com.spring_boot.onlab_03.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private String nationality;
    private String birthdate;
    private String gender;
}
