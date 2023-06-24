package com.example.salesofgoodorder.notebookDao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "notebook_orders")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotebookOrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private Integer id;
    private String brand;
    private Integer price;


}
