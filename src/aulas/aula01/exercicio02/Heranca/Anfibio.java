package aulas.aula01.exercicio02.Heranca;

public class Anfibio extends Animal{
    public String pele;

    public Anfibio(String _nome, int _idade, String _pele) {
        super(_nome, _idade);
        this.pele = _pele;
    }
}
