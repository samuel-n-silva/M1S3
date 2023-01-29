package exercicios.exercicio_tres;

public class PessoaFisica {
    private String cpf;

     PessoaFisica(String _cpf) {
        this.cpf = _cpf;
    }

    public void exibirPessoa(){
        System.out.println("Davi Nunes"+" Cpf:"+cpf);
    }
}
