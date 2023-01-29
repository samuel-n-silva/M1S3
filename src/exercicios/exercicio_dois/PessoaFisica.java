package exercicios.exercicio_dois;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica(String _nome, String _endereco, String _cpf) {
        super(_nome, _endereco);
        this.setCpf(_cpf);
    }
}
