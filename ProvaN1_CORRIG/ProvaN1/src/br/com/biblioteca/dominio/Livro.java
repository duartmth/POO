package br.com.biblioteca.dominio;

import java.time.LocalDate;

public class Livro extends Colecao {
    protected String codigoISBN;
    protected int codigoAutor;
    protected String titulo;

    public Livro() {

    }

    public String getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public int getCodigoAutor() {
        return codigoAutor;
    }

    public void setCodigoAutor(int codigoAutor) {
        this.codigoAutor = codigoAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Livro(int codigo, String descricao, LocalDate dataCadastro, String codigoISBN, int codigoAutor,
            String titulo) {
        super(codigoAutor, descricao, dataCadastro, titulo);
    }

}
