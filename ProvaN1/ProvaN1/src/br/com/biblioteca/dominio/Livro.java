package br.com.biblioteca.dominio;

import java.time.LocalDate;

public class Livro extends Colecao {
    protected String codigoISBN;
    protected int codigoAutor;
    protected String titulo;

    public Livro() {

    }

    public Livro (int codigo, String descricao, LocalDate dataCadastro, String codigoISBN, int codigoAutor, String titulo){
        super(codigoAutor, descricao, dataCadastro, titulo);
    }

}
