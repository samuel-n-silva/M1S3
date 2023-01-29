package exercicios.exercicio_quatro;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String _nome, String _cnpj) {
        super(_nome);
        this.cnpj = _cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
