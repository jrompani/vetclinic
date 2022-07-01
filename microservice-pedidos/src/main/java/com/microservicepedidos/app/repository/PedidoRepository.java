package com.microservicepedidos.app.repository;

import com.microservicepedidos.app.model.Pedido;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends PagingAndSortingRepository<Pedido, Long> {
}
