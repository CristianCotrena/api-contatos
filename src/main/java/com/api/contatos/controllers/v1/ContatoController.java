package com.api.contatos.controllers.v1;

import com.api.contatos.base.dtos.BaseDto;
import com.api.contatos.entity.dto.ContatoRequestDto;
import com.api.contatos.services.v1.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/contato")
public class ContatoController {
    final ContatoService contatoService;

    public ContatoController(ContatoService contatoService) {
        this.contatoService = contatoService;
    }
    @PostMapping()
    public ResponseEntity<BaseDto> postContato(@RequestBody ContatoRequestDto  contatoRequestDto) {
        return contatoService.resgistrarContato(contatoRequestDto);

    }

}
