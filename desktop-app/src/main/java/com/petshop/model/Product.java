package com.petshop.model;

import lombok.Data; 
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
}