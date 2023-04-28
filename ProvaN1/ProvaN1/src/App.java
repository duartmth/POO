
import br.com.biblioteca.fakeDB.Colecao;
import br.com.biblioteca.fakeDB.ColecaoFakeDB;

public class App {
    public static void main(String[] args) throws Exception {

        ColecaoFakeDB db = new ColecaoFakeDB();

        for (Colecao c : db.getTabela()) {
            ;
            System.out.println(c.toString());
        }

    }
}
