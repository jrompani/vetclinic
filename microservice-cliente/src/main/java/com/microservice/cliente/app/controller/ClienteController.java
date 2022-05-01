package com.microservice.cliente.app.controller;

import com.microservice.cliente.app.model.Cliente;
import com.microservice.cliente.app.service.ClienteService;
import com.microservice.commons.app.controller.CommonController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController extends CommonController<Cliente, ClienteService> {
}
