package com.fish.fishNet.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DtoRegistro {
    private String username;
    private String password;
    private String nombre;
    private String apellido;
    private Integer telefono;
    private String email;
    private LocalDate fechaRegistro;
}
