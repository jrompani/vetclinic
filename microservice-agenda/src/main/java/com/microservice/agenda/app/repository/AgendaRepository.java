package com.microservice.agenda.app.repository;

import com.microservice.agenda.app.model.Agenda;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepository extends PagingAndSortingRepository<Agenda, Long> {
}
