package com.br.bikeshop.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity(name = "Pessoa")
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "nome", length = 60)
    @NotBlank(message = "Nome não pode ser nulo")
    private String nome;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_nascimento")
    private Date dateNasc;

    @Column(name = "Telefone", length = 13)
    @NotBlank(message = "Telefone não pode ser nulo")
    private String telefone;

    @Column(name = "endereco", length = 60)
    @NotBlank(message = "Endereço não pode ser nulo")
    private String endereco;

    @Column(name = "cpf", length = 14, unique = true)
    @NotBlank(message = "CPF não pode ser nulo")
    private String cpf;

    @JsonBackReference
    @OneToOne(mappedBy = "pessoa", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDateNasc() {
        return dateNasc;
    }

    public void setDateNasc(Date dateNasc) {
        this.dateNasc = dateNasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
