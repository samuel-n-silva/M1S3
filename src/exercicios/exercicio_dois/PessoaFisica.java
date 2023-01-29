package exercicios.exercicio_dois;

public class PessoaFisica extends Pessoa {
    protected String cpf;

    protected String getCpf() {
        return cpf;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }

    protected PessoaFisica(String _nome, String _endereco, String _cpf) {
        super(_nome, _endereco);
        this.setCpf(_cpf);
    }
}
