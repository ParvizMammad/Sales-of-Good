package com.example.salesofgood.model;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TelephoneDto {

    private Integer id;
    private String brand;
    private Integer price;
    private Double screen;
    private Integer internalMemory;
    private Integer operativeMemory;
    private Integer camera;
    private String operatingSystem;
    private Integer simCard;
    private Double weight;
    private String producer;
    private String color;

}
