import java.time.LocalDate;

import br.com.atacado.dominio.*;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        PessoaFisica p1 = new PessoaFisica(1, "Mateus", "mateus@ceu.com.br", "ceu.com.br", LocalDate.now(), "123",
                "456", "M", "Parda", "Hebreu", "Jerusalem", "Pai do Mateus", "Mae do Mateus");

        PessoaJuridica pj1 = new PessoaJuridica(2, "ACME LTDA", "gerente@acme.com.br", "acme.com.br", LocalDate.now(),
                "123456", "36963123", "1231513", "Pipiu e Frajola Bar e Lanches");
    }
}
