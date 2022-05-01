package com.microservice.producto.microserviceproducto.controller;

import com.microservice.commons.app.controller.CommonController;
import com.microservice.producto.microserviceproducto.model.Producto;
import com.microservice.producto.microserviceproducto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController extends CommonController<Producto, ProductoService> {

}
