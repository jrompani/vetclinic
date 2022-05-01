package com.microservice.commons.app.controller;

import com.microservice.commons.app.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CommonController<E, S extends CommonService<E>> {

    @Autowired
    protected S service;

    @GetMapping
    public ResponseEntity<?> listar(){
        return ResponseEntity.ok().body(service.findAll());
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody E entity, BindingResult result){

        if(result.hasErrors()) {
            return this.validar(result);
        }
        E entityDb = service.save(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(entityDb);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        Optional<E> optional = service.findById(id);

        if(optional.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(optional.get());
    }

    public ResponseEntity<Map<String, Object>> validar(BindingResult result){
        Map<String, Object> errors = new HashMap<>();

        result.getFieldErrors().forEach(err ->
        {
            errors.put(err.getField(), "El campo "+ err.getField() + " " + err.getDefaultMessage());
        });

        return ResponseEntity.badRequest().body(errors);
    }

}
