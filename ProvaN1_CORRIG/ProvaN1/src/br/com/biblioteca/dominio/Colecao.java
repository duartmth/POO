package br.com.biblioteca.dominio;

import java.time.LocalDate;

public class Colecao extends BaseBiblioteca {
    protected String editora;

    public Colecao() {

    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Colecao(int codigo, String descricao, LocalDate dataCadastro, String editora) {
        super(codigo, descricao, dataCadastro);
    }

}
