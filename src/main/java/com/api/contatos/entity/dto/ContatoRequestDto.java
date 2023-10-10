package com.api.contatos.entity.dto;

import java.util.UUID;

public class ContatoRequestDto {

    private UUID idCliente;
    private UUID idFuncionario;
    private UUID idFornecedor;
    private String contato;
    private Integer status;

    public ContatoRequestDto() {
    }

    public ContatoRequestDto(UUID idCliente, UUID idFuncionario, UUID idFornecedor, String contato, Integer status) {
        this.idCliente = idCliente;
        this.idFuncionario = idFuncionario;
        this.idFornecedor = idFornecedor;
        this.contato = contato;
        this.status = status;
    }

    public UUID getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(UUID idCliente) {
        this.idCliente = idCliente;
    }

    public UUID getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(UUID idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public UUID getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(UUID idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
