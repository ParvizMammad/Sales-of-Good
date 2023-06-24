package com.example.salesofgood.telephoneDao;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.math.BigDecimal;

@Table(name = "telephones")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TelephoneEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Please provide a brand")
    private String brand;
    @NotNull(message = "Price not null")
    @DecimalMin("0")
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
