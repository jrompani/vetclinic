package com.microservice.producto.microserviceproducto.model;

import javax.persistence.*;

@Entity
public class ProductoTipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
    @Column
    private String description;
    @Column
    private Double price;
}
