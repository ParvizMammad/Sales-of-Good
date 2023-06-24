package com.example.salesofgood.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WashingMachineDto {

    private Integer id;
    private String brand;
    private Integer price;
    private Double maxLaundryCapacity;
    private Integer programsQuantity;
    private Double depth;
    private String motorType;
    private Double height;
    private Double wide;
    private String color;
    private String producer;

}
