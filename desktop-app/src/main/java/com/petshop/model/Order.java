package com.petshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private int id;
    private int customerId;
    private LocalDateTime orderDate;
    private BigDecimal totalAmount;
}
