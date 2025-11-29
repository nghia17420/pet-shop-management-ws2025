package com.petshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal; // BigDecimal is better for currency than double

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int id;
    private String name;
    private String role;
    private String phone;
    private BigDecimal salary; 
    private String status;
}
