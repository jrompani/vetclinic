package com.microservice.agenda.app.service;

import com.microservice.agenda.app.model.Agenda;
import com.microservice.agenda.app.repository.AgendaRepository;
import com.microservice.commons.app.service.CommonServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AgendaServiceImpl extends CommonServiceImpl<Agenda, AgendaRepository> implements AgendaService {
}
