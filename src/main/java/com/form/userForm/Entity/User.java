package com.form.userForm.Entity;


import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String first_name;

    @NotNull
    private String last_name;

    private String street;

    private String address;

    private String city;

    private String state;

    private String email;

    private String phone;


}
