package exercicios.exercicio_tres;

public class Main {
    public static void main(String[] args) {
        PessoaFisica novaPessoaFs = new PessoaFisica("74031231");
        PessoaJuridica novaPessoaPj = new PessoaJuridica("9873214987");

        novaPessoaFs.exibirNomeCompleto();
        novaPessoaPj.exibirNomeCompleto();
    }
}
