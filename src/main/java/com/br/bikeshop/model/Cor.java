package com.br.bikeshop.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity(name = "Cor")
@Table(name = "cor")
public class Cor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "cor")
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
        if (!(o instanceof Cor)) return false;
        Cor cor = (Cor) o;
        return getId().equals(cor.getId()) &&
                getNome().equals(cor.getNome()) &&
                getBicicletas().equals(cor.getBicicletas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getBicicletas());
    }

    @Override
    public String toString() {
        return "Cor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", bicicletas=" + bicicletas +
                '}';
    }
}
