package com.microservicepedidos.app.controller;

import com.microservice.commons.app.controller.CommonController;
import com.microservicepedidos.app.model.Pedido;
import com.microservicepedidos.app.service.PedidoService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController extends CommonController<Pedido, PedidoService> {
}
