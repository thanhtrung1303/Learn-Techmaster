package com.spring_boot.onlab_03.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private String manufacturer;
    private int price;
}
