package com.br.bikeshop.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity(name = "Bicicleta")
@Table(name = "bicicleta")
public class Bicicleta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_marca")
    private Marca marca;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_cor")
    private Cor cor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_modelo")
    private Modelo modelo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public com.br.bikeshop.model.Marca getMarca() {
        return marca;
    }

    public void setMarca(com.br.bikeshop.model.Marca marca) {
        this.marca = marca;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bicicleta)) return false;
        Bicicleta bicicleta = (Bicicleta) o;
        return getId().equals(bicicleta.getId()) &&
                getMarca().equals(bicicleta.getMarca()) &&
                getCor().equals(bicicleta.getCor()) &&
                getModelo().equals(bicicleta.getModelo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMarca(), getCor(), getModelo());
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "id=" + id +
                ", marca=" + marca +
                ", cor=" + cor +
                ", modelo=" + modelo +
                '}';
    }
}
