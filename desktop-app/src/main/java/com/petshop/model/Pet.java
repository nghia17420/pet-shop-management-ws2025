package com.petshop.model;

import lombok.Data; 
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor

public class Pet {
    private int id;
    private int ownerId;
    private String name;
    private String species;
    private String healthStatus;

}
