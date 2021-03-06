package com.br.bikeshop.model;

import javax.persistence.*;

@Entity(name = "MetodoDePagamento")
@Table(name = "metodoDePagamento")
public class MetodoDePagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false, unique = true, length = 25, name = "pagamento")
    private String pagamento;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

}
