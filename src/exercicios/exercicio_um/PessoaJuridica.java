package exercicios.exercicio_um;

public class PessoaJuridica extends Pessoa{
    public String cnpj;

    public PessoaJuridica(String _nome, String _endereco, String _cnpj) {
        super(_nome, _endereco);
        this.cnpj = _cnpj;
    }
}
