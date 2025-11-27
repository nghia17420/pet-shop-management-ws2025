package com.petshop.model;

import lombok.Data; 
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor

public class Customer {
    private int id;
    private String name;
    private String email;
    private String phone;
}