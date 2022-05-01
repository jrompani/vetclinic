package com.microservice.producto.microserviceproducto.service;

import com.microservice.commons.app.service.CommonServiceImpl;
import com.microservice.producto.microserviceproducto.model.Producto;
import com.microservice.producto.microserviceproducto.repository.ProductoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl extends CommonServiceImpl<Producto, ProductoRepository> implements ProductoService{
}
