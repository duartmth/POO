package br.com.biblioteca.fakeDB;

import java.time.LocalDate;

import br.com.biblioteca.dominio.Livro;

public class LivroFakeDB extends BaseFakeDB<Livro> {

    @Override
    public void AutoFill() {
        this.tabela.add(new br.com.biblioteca.dominio.Livro(1, "Terror", LocalDate.now(), "11", 1, "A casa"));
        this.tabela.add(new br.com.biblioteca.dominio.Livro(2, "Suspense", LocalDate.now(), "21", 2, "A filha"));
        this.tabela.add(new br.com.biblioteca.dominio.Livro(3, "Aventura", LocalDate.now(), "31", 3,"Viagem ao centro da terra"));
        this.tabela.add(new br.com.biblioteca.dominio.Livro(1, "Acao", LocalDate.now(), "41", 4, "Tiroteio"));
        this.tabela.add(new br.com.biblioteca.dominio.Livro(1, "Fantasia", LocalDate.now(), "51", 5, "O mundo esquecido"));
    }
}
