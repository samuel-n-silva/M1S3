package aulas.aula01.exercicio02;

import aulas.aula01.exercicio02.Heranca.Ave;

public class Pato extends Ave {
    public String adotado;

    public Pato(String _nome, int _idade, String _especie, String _adotado) {
        super(_nome, _idade, _especie);
        this.adotado = _adotado;
    }
}
