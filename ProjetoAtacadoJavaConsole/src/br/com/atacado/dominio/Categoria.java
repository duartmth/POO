package br.com.atacado.dominio;

import java.time.LocalDate;
import java.util.List;

public class Categoria {

    private int codigo;

    private String descricao;

    private LocalDate dateDeInclusao;

    private List<Subcategoria> subcategorias;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDateDeInclusao() {
        return dateDeInclusao;
    }

    public void setDateDeInclusao(LocalDate dateDeInclusao) {
        this.dateDeInclusao = dateDeInclusao;
    }

    public List<Subcategoria> getSubcategorias() {
        return subcategorias;
    }

    public void setSubcategorias(List<Subcategoria> subcategorias) {
        this.subcategorias = subcategorias;
    }

    public Categoria() {
    }

    public Categoria(int codigo, String descricao, LocalDate dateDeInclusao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dateDeInclusao = dateDeInclusao;
    }

}
