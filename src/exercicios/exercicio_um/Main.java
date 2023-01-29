package exercicios.exercicio_um;

public class Main {
    public static void main(String[] args) {
        PessoaFisica novaPf = new PessoaFisica("Samuel","Rua castro mendes","9023123244");
        PessoaJuridica novaPj = new PessoaJuridica("Romero","Rua catavanto","9023123244");

        System.out.println(novaPf.nome+" CPF:"+novaPf.cpf);
        System.out.println(novaPj.nome+" CNPJ:"+novaPj.cnpj);

    }
}
