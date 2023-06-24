package com.example.salesofgood.refrigeratorDao;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "refrigerator")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RefrigeratorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "please provide a brand")
    private String brand;
    @NotNull(message = "Price not null")
    @DecimalMin("0")
    private Integer price;
    private String type;
    private Integer numberOfDoors;
    private String shelvesMaterial;
    private String color;
    private Double height;
    private Double wide;
    private Double depth;
    private String compressorType;
    private String meltingSystem;
    private String producer;

}
