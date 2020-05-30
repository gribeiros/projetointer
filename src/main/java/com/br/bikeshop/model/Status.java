package com.br.bikeshop.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity(name = "Status")
@Table(name = "status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "nome", unique = true, length = 20)
    @NotBlank(message = "Status not null")
    private String status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
