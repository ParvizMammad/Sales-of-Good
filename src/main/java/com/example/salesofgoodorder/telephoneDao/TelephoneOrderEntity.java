package com.example.salesofgoodorder.telephoneDao;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Table(name = "telephones_orders")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TelephoneOrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private Integer id;
    private String brand;
    private Integer price;

}
