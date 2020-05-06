package com.br.bikeshop.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Multa")
@Table(name = "multa")
public class Multa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "valor", nullable = false)
    private Double valor;

    @Temporal(TemporalType.DATE)
    @Column(name = "tempo", nullable = false)
    private Date tempo;

    @JsonBackReference
    @OneToOne(mappedBy = "multa", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Aluguel aluguel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getTempo() {
        return tempo;
    }

    public void setTempo(Date tempo) {
        this.tempo = tempo;
    }
}
