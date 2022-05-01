package com.microservice.producto.microserviceproducto.repository;

import com.microservice.producto.microserviceproducto.model.Producto;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductoRepository extends PagingAndSortingRepository<Producto, Long> {
}
