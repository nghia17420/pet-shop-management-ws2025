package com.petshop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    private int id;
    private int ownerId;
    private String name;
    private String species;
    private String healthStatus;
}
    