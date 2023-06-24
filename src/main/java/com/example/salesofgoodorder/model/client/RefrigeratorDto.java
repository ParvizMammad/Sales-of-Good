package com.example.salesofgoodorder.model.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RefrigeratorDto {

    private Integer id;
    private String brand;
    private Integer price;
    private String type;
    private Integer numberOfDoors;
    private String shelvesMaterial;
    private String color;
    private Double height;
    private Double wide;
    private Double depth;
    private String compressortype;
    private String meltingSystem;
    private String producer;


}
