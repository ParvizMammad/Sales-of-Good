package com.example.salesofgoodorder.washingMachineDao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "washing_machine_orders")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WashingMachineOrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private Integer id;
    private String brand;
    private Integer price;



}
