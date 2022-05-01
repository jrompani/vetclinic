package com.microservice.producto.microserviceproducto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "producto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(name = "createAt")
    private LocalDate createAt;

    @ManyToOne
    @JoinColumn(name="productoTipo_id")
    private ProductoTipo tipo;

}
