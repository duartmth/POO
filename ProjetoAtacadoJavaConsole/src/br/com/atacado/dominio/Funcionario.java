package br.com.atacado.dominio;

import java.time.LocalDate;

public class Funcionario extends BasePessoa {

    private String matricula;

    private String login;

    private String senha;

    private LocalDate dataContratacao;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Funcionario() {
        super(0, "", "", "", LocalDate.now());
        // construtor vazio
    }

    public Funcionario(int codigoPessoa, String nome, String email, String site, LocalDate dataInclusao,
            String matricula, String login, String senha, LocalDate dataContratacao) {
        super(codigoPessoa, nome, email, site, dataInclusao);
        this.matricula = matricula;
        this.login = login;
        this.senha = senha;
        this.dataContratacao = dataContratacao;
    }

    @Override
    public void Imprimir() {
        // Código para imprimir informações do funcionário
        System.out.println("Funcionário: " + nome + ", Matrícula: " + matricula);
    }
}
