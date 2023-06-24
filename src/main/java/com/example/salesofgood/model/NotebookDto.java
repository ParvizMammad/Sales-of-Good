package com.example.salesofgood.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotebookDto{

    private Integer id;
    private String brand;
    private Integer price;
    private String model;
    private Double screenDiagonal;
    private String videoCardType;
    private String processor;
    private String monitorFrequency;
    private Integer operativeMemory;
    private String operatingSystem;
    private Double weight;
    private String color;
    private String producer;


}
