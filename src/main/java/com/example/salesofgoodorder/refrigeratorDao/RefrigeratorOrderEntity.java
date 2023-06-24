package com.example.salesofgoodorder.refrigeratorDao;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "refrigerator_orders")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RefrigeratorOrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private Integer id;
    private String brand;
    private Integer price;


}
