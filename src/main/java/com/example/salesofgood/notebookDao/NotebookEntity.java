package com.example.salesofgood.notebookDao;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "notebook")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotebookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Please provide a brand")
    private String brand;
    @NotNull(message = "Price not null")
    @DecimalMin("0")
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
