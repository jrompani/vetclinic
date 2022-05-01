package com.microservice.cliente.app.repository;

import com.microservice.cliente.app.model.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Long> {
}
