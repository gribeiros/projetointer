package com.br.bikeshop.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Aluguel")
@Table(name = "aluguel")
public class Aluguel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false, updatable = false, name = "tempo_inicio")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date tempo_inicio;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false, updatable = false, name = "tempo_final")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date tempo_final;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_status", nullable = false)
    private Status status;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_multa", unique = true)
    private Multa multa;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_metodo_de_pagamento", nullable = false)
    private MetodoDePagamento metodoDePagamento;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_bicicleta", nullable = false)
    private Bicicleta bicicleta;

    public Aluguel() {
    }

    public Aluguel(Long id, Date tempo_inicio, Date tempo_final, Usuario usuario, Status status, Multa multa, MetodoDePagamento metodoDePagamento, Bicicleta bicicleta) {
        this.id = id;
        this.tempo_inicio = tempo_inicio;
        this.tempo_final = tempo_final;
        this.usuario = usuario;
        this.status = status;
        this.multa = multa;
        this.metodoDePagamento = metodoDePagamento;
        this.bicicleta = bicicleta;
    }

    public Aluguel(Date tempo_inicio, Date tempo_final, Usuario usuario, Status status, Multa multa, MetodoDePagamento metodoDePagamento, Bicicleta bicicleta) {
        this.tempo_inicio = tempo_inicio;
        this.tempo_final = tempo_final;
        this.usuario = usuario;
        this.status = status;
        this.multa = multa;
        this.metodoDePagamento = metodoDePagamento;
        this.bicicleta = bicicleta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTempo_inicio() {
        return tempo_inicio;
    }

    public void setTempo_inicio(Date tempo_inicio) {
        this.tempo_inicio = tempo_inicio;
    }

    public Date getTempo_final() {
        return tempo_final;
    }

    public void setTempo_final(Date tempo_final) {
        this.tempo_final = tempo_final;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Multa getMulta() {
        return multa;
    }

    public void setMulta(Multa multa) {
        this.multa = multa;
    }

    public MetodoDePagamento getMetodoDePagamento() {
        return metodoDePagamento;
    }

    public void setMetodoDePagamento(MetodoDePagamento metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }
}
