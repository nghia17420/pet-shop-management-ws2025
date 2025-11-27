package com.petshop.model;

import lombok.Data; 
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor

public class Order {
    private int id;
    private int customerId;
    private String orderDate;
    private int totalAmount;
}
