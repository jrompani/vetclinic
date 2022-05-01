package com.microservice.cliente.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String apellido;

    private LocalDate fechaNacimiento;

    private String telefono;

    private String direccion;

    private String ciudad;

    private String calle;

    private String numeroCalle;

    private String cp;

    private String email;

    private String dni;

    private String dniTipo;

}
