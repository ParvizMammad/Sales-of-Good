package com.example.salesofgood.washingMachineDao;


import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name ="washing_machine")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WashingMachineEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Please provide a brand")
    private String brand;
    @NotNull(message = "Price not null")
    @DecimalMin("0")
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
