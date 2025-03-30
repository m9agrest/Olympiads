package com.example.olympiads.user;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class User {
    private int id;
    private String email;
    private String password;
    private String name;
    private String surname;
    private String photo;
    private LocalDate birth;
}
