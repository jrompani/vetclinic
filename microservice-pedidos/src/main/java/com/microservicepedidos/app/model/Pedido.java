package com.microservicepedidos.app.model;

import com.microservice.cliente.app.model.Cliente;
import com.microservicefacturacion.app.model.Factura;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



}
