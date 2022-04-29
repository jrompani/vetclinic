package com.microservice.producto.app.repository;

import com.microservice.producto.app.model.Producto;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductoRepository extends PagingAndSortingRepository<Producto, Long> {
}
