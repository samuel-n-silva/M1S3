package exercicios.exercicio_um;

public class PessoaFisica extends Pessoa{
    public String cpf;

    public PessoaFisica(String _nome, String _endereco, String _cpf) {
        super(_nome, _endereco);
        this.cpf = _cpf;
    }
}
