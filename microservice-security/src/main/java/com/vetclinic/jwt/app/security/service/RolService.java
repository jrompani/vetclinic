package com.vetclinic.jwt.app.security.service;

import com.vetclinic.jwt.app.security.enums.RolNombre;
import com.vetclinic.jwt.app.security.model.Rol;
import com.vetclinic.jwt.app.security.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolnombre){
        return rolRepository.findByRolNombre(rolnombre);
    }
    public void save(Rol rol){
       rolRepository.save(rol);
    }
}
