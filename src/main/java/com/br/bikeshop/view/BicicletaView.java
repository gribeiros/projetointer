package com.br.bikeshop.view;

public class BicicletaView {
    private Long bike_id;
    private String marca_nome;
    private String modelo_nome;
    private String cor_nome;

    public Long getBike_id() {
        return bike_id;
    }

    public void setBike_id(Long bike_id) {
        this.bike_id = bike_id;
    }

    public String getMarca_nome() {
        return marca_nome;
    }

    public void setMarca_nome(String marca_nome) {
        this.marca_nome = marca_nome;
    }

    public String getModelo_nome() {
        return modelo_nome;
    }

    public void setModelo_nome(String modelo_nome) {
        this.modelo_nome = modelo_nome;
    }

    public String getCor_nome() {
        return cor_nome;
    }

    public void setCor_nome(String cor_nome) {
        this.cor_nome = cor_nome;
    }
}
