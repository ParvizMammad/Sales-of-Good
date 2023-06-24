package com.example.salesofgood.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class NoFoundExceptionDto {

    Integer exceptionId;
    String exceptionMessage;

}
