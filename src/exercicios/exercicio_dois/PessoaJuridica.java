package exercicios.exercicio_dois;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    private void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String _nome, String _endereco, String _cnpj) {
        super(_nome, _endereco);
        this.setCnpj(_cnpj);
    }
}
