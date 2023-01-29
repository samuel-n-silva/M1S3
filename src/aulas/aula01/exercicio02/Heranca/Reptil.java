package aulas.aula01.exercicio02.Heranca;

public class Reptil extends Animal{
    public String alimentado;

    public Reptil(String _nome, int _idade, String _alimentado) {
        super(_nome, _idade);
        this.alimentado = _alimentado;
    }
}
