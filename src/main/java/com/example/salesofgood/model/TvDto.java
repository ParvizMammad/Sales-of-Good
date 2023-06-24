package com.example.salesofgood.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TvDto {

    private Integer id;
    private String brand;
    private Integer price;
    private Double screenDiagonal;
    private String screenType;
    private Integer frequency;
    private String producer;

}
