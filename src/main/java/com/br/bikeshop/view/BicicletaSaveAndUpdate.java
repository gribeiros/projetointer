package com.br.bikeshop.view;


public class BicicletaSaveAndUpdate {
    private Long id;
    private Long cor;
    private Long marca;
    private Long modelo;

    public BicicletaSaveAndUpdate() {
    }

    public BicicletaSaveAndUpdate(Long id,Long cor, Long marcaId, Long modeloId) {
        this.id = id;
        this.cor = cor;
        this.marca = marcaId;
        this.modelo = modeloId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCor() {
        return cor;
    }

    public void setCor(Long cor) {
        this.cor = cor;
    }

    public Long getMarca() {
        return marca;
    }

    public void setMarca(Long marca) {
        this.marca = marca;
    }

    public Long getModelo() {
        return modelo;
    }

    public void setModelo(Long modelo) {
        this.modelo = modelo;
    }
}
