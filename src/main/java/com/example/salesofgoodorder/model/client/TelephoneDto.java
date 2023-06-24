package com.example.salesofgoodorder.model.client;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TelephoneDto  {

    private Integer id;
    private String brand;
    private Integer price;
    private Double screen;
    private Integer camera;
    private String operatingSystem;
    private Integer simCard;
    private Double weight;
    private String producer;
    private String color;

}
