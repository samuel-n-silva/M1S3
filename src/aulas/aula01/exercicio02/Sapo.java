package aulas.aula01.exercicio02;

import aulas.aula01.exercicio02.Heranca.Anfibio;

public class Sapo extends Anfibio {
    public String venenoso;

    public Sapo(String _nome, int _idade, String _pele, String _venenoso) {
        super(_nome, _idade, _pele);
        this.venenoso = _venenoso;
    }
}
