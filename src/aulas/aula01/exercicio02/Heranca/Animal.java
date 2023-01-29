package aulas.aula01.exercicio02.Heranca;

public class Animal {
    public String nome;
    public int idade;
    public Animal(String _nome, int _idade) {
        this.nome = _nome;
        this.idade = _idade;
    }
    public void andar(){
        System.out.println(" Andando ....");
    }

    public final void comer(){
        System.out.println(" Comendo ....");
    }
}
