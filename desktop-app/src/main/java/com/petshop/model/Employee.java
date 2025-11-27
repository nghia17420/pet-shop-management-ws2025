package com.petshop.model;

// Generates Getters/Setters automatically
import lombok.Data; 
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private String role;
    private String phone;
    private double salary;
    private boolean isActive;
}
