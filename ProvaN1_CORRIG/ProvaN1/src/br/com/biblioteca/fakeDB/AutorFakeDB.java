package br.com.biblioteca.fakeDB;

import java.time.LocalDate;

import br.com.biblioteca.dominio.Autor;

public class AutorFakeDB extends BaseFakeDB <Autor>{

    @Override
    public void AutoFill() {
        this.tabela.add(new br.com.biblioteca.dominio.Autor(1, "Terror", LocalDate.now(), "Aurelio", "Antonio"));
        this.tabela.add(new br.com.biblioteca.dominio.Autor(2, "Suspense", LocalDate.now(), "Joao", "Valim"));
        this.tabela.add(new br.com.biblioteca.dominio.Autor(3, "Aventura",  LocalDate.now(), "Felipe", "Silva"));
        this.tabela.add(new br.com.biblioteca.dominio.Autor(4, "Acao",  LocalDate.now(), "Mariano", "Guimaraes"));
        this.tabela.add(new br.com.biblioteca.dominio.Autor(5, "Fantasia",  LocalDate.now(), "Luiz", "Linus"));
    }


    
}
