package com.techmaster.onlab2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String name;
    private String manufacturer;
    private int price;
}
