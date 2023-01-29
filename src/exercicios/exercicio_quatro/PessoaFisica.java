package exercicios.exercicio_quatro;

public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String _nome, String _cpf) {
        super(_nome);
        this.cpf = _cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
