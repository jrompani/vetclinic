package com.vetclinic.jwt.app.security.repository;

import com.vetclinic.jwt.app.security.enums.RolNombre;
import com.vetclinic.jwt.app.security.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
    Optional<Rol> findByRolNombre(RolNombre rolnombre);

}
