package br.com.biblioteca.fakeDB;

import java.time.LocalDate;

import br.com.biblioteca.fakeDB.Colecao;

public class ColecaoFakeDB extends BaseFakeDB<Colecao> {

    @Override
    public void AutoFill() {
        this.tabela.add(new br.com.biblioteca.dominio.Colecao(1, "Terror", LocalDate.now(), "Uniderp"));
        this.tabela.add(new br.com.biblioteca.dominio.Colecao(2, "Suspense", LocalDate.now(), "Nova"));
        this.tabela.add(new br.com.biblioteca.dominio.Colecao(3, "Aventura", LocalDate.now(), "Velha"));
        this.tabela.add(new br.com.biblioteca.dominio.Colecao(4, "Acao", LocalDate.now(), "Joaquim"));
        this.tabela.add(new br.com.biblioteca.dominio.Colecao(5, "Fantasia", LocalDate.now(), "Mariano"));

    }
}
