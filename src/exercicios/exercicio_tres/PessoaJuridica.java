package exercicios.exercicio_tres;

public class PessoaJuridica {
    private String cnpj;

    public PessoaJuridica(String _cnpj) {
        this.cnpj = _cnpj;
    }

    public void exibirPessoa(){
        System.out.println("Rodrigo Lima"+" Cnpj:"+cnpj);
    }
}
