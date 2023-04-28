package br.com.atacado.fakeDB;

import java.time.LocalDate;

import br.com.atacado.dominio.CategoriaFakeDB;

public class SubcategoriaFakeDB extends BaseFakeDB<CategoriaFakeDB> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Subcategoria());
    }

}
