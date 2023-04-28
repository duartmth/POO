package br.com.biblioteca.dominio;

import java.time.LocalDate;

public class Colecao extends BaseBiblioteca {
    protected String editora;

    public Colecao() {

    }

    public Colecao(int codigo, String descricao, LocalDate dataCadastro, String editora) {
        super(codigo, descricao, dataCadastro);
    }
}
