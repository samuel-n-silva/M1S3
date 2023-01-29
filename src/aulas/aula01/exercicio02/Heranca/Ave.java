package aulas.aula01.exercicio02.Heranca;

public class Ave extends Animal{
    public String especie;

    public Ave(String _nome, int _idade, String _especie) {
        super(_nome, _idade);
        this.especie = _especie;
    }
}
