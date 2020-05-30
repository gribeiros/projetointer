package com.br.bikeshop.view;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;

public class AluguelSaveAndUpdate {
    private Long id;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date data;
    private Long bicicleta;
    private Long metodoDePagamento;
    private Long multa;
    private Long status;
    private Long usuario;

    public AluguelSaveAndUpdate() {
    }

    public AluguelSaveAndUpdate(Long id, Date data, Long bicicleta, Long metodoDePagamento, Long multa, Long status, Long usuario) {
        this.id = id;
        this.data = data;
        this.bicicleta = bicicleta;
        this.metodoDePagamento = metodoDePagamento;
        this.multa = multa;
        this.status = status;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Long getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Long bicicleta) {
        this.bicicleta = bicicleta;
    }

    public Long getMetodoDePagamento() {
        return metodoDePagamento;
    }

    public void setMetodoDePagamento(Long metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public Long getMulta() {
        return multa;
    }

    public void setMulta(Long multa) {
        this.multa = multa;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }
}
