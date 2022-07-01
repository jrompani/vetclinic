package com.microservicepedidos.app.service;

import com.microservice.commons.app.service.CommonServiceImpl;
import com.microservicepedidos.app.model.Pedido;
import com.microservicepedidos.app.repository.PedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl extends CommonServiceImpl<Pedido, PedidoRepository> {
}
