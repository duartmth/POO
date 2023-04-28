package br.com.atacado.fakeDB;

public class Produtos extends BaseFakeDB<Produtos> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Produtos());
    }

}
