package aulas.aula01.exercicio02.Heranca;

public class Mamifero extends Animal{
    public String castrado;

    public Mamifero(String _nome, int _idade, String _castrado) {
        super(_nome, _idade);
        this.castrado = _castrado;
    }
}
