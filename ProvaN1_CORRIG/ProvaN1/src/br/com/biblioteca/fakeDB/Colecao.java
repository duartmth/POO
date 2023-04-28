package br.com.biblioteca.fakeDB;

public class Colecao extends BaseFakeDB<Colecao> {
    @Override
    public void AutoFill() {
        this.tabela.add(new Colecao());
    }
}
