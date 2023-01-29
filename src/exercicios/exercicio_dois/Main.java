package exercicios.exercicio_dois;

public class Main {
    public static void main(String[] args) {
        PessoaFisica novaPf = new PessoaFisica("Samuel","Rua castro mendes","9023123244");
        PessoaJuridica novaPj = new PessoaJuridica("Romero","Rua catavanto","9023123244");

        System.out.println(novaPf.getNome()+" CPF:"+novaPf.getCpf());
        System.out.println(novaPj.getNome()+" CNPJ:"+novaPj.getCnpj());

    }
}
