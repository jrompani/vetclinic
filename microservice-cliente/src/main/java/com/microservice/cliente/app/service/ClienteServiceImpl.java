package com.microservice.cliente.app.service;

import com.microservice.cliente.app.model.Cliente;
import com.microservice.cliente.app.repository.ClienteRepository;
import com.microservice.commons.app.service.CommonServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl extends CommonServiceImpl<Cliente, ClienteRepository> implements ClienteService {
}
