package com.br.bikeshop.view;

public class UsuarioSaveAndUpdate {

    private Long id;
    private String login;
    private String senha;
    private Long pessoa;

    public UsuarioSaveAndUpdate() {
    }

    public UsuarioSaveAndUpdate(Long id, String login, String senha, Long pessoa) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.pessoa = pessoa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Long getPessoa() {
        return pessoa;
    }

    public void setPessoa(Long pessoa) {
        this.pessoa = pessoa;
    }
}
