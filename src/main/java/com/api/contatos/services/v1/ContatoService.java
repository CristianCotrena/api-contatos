package com.api.contatos.services.v1;

import com.api.contatos.base.dtos.BaseDto;
import com.api.contatos.entity.dto.ContatoRequestDto;
import com.api.contatos.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {
    @Autowired
    private ContatoRepository contatoRepository;

}
