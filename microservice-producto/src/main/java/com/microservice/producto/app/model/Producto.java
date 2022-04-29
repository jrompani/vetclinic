package com.microservice.producto.app.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate createAt;

    @ManyToOne
    @JoinColumn(name="productoTipo_id")
    private ProductoTipo tipo;

}
