package com.example.salesofgoodorder.model.client;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private Integer id;

    private String firstName;

    private String lastName;


    private String email;

    private String password;

}
