package com.microservice.cliente.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String calle;

    private String calle_numero;

    private String cp;

    private String localidad;

    private String ciudad;

    @OneToMany(mappedBy = "direccion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Cliente> clientes;

}
