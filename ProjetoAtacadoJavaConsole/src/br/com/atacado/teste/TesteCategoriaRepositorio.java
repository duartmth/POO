package br.com.atacado.teste;

import java.util.List;

import br.com.atacado.dominio.Produto;
//import br.com.atacado.dominio.Categoria;
//import br.com.atacado.dominio.Subcategoria;
import br.com.atacado.repositorio.ProdutoRepositorio;
// import br.com.atacado.repositorio.CategoriaRepositorio;
//import br.com.atacado.repositorio.SubcategoriaRepositorio;

public class TesteCategoriaRepositorio {

    private ProdutoRepositorio repositorio;

    public TesteCategoriaRepositorio() {
        this.repositorio = new ProdutoRepositorio();
    }

    public void Executar() {
        List<Produto> produtos = this.repositorio.Read();
        for (Produto tupla : produtos) {
            System.out.println(tupla.toString());
        }
    }
}
