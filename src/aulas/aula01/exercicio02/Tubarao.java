package aulas.aula01.exercicio02;

import aulas.aula01.exercicio02.Heranca.Peixe;

public class Tubarao extends Peixe {
    public String alimentado;

    public Tubarao(String _nome, int _idade, String _especie, String _alimentado) {
        super(_nome, _idade, _especie);
        this.alimentado = _alimentado;
    }
}
