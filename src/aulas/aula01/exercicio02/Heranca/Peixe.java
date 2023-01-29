package aulas.aula01.exercicio02.Heranca;

public class Peixe extends Animal{
    public String especie;

    public Peixe(String _nome, int _idade, String _especie) {
        super(_nome, _idade);
        this.especie = _especie;
    }
}
