package exercicios.exercicio_dois;

public class PessoaJuridica extends Pessoa {
    protected String cnpj;

    protected String getCnpj() {
        return cnpj;
    }

    protected void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    protected PessoaJuridica(String _nome, String _endereco, String _cnpj) {
        super(_nome, _endereco);
        this.setCnpj(_cnpj);
    }
}
