package com.microservicefacturacion.app.model;

import com.microservice.cliente.app.model.Cliente;
import com.microservice.producto.microserviceproducto.model.Producto;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "factura")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Producto> producto;

    @ManyToOne
    private Cliente cliente;
}
