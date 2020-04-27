package com.br.bikeshop.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

@Entity(name = "Marca")
@Table(name = "marca")
public class Marca   {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nome",unique = true,length = 20)
    @NotNull(message = "Nome not null")
    private String nome;

    @JsonBackReference
    @OneToMany(mappedBy = "marca", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Bicicleta> bicicletas;

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

    public List<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(List<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Marca)) return false;
        Marca marca = (Marca) o;
        return getId() == marca.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
