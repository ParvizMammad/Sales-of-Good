package com.example.salesofgood.tvDao;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "tv")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TvEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Please provide a brand")
    private String brand;
    @NotNull(message = "Price not null")
    @DecimalMin("0")
    private Integer price;
    private Double screenDiagonal;
    private String screenType;
    private Integer frequency;
    private String producer;
}
