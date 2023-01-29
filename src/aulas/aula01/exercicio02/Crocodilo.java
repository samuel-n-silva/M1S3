package aulas.aula01.exercicio02;

import aulas.aula01.exercicio02.Heranca.Reptil;

public class Crocodilo extends Reptil {
    public String local;

    public Crocodilo(String _nome, int _idade, String _alimentado, String _local) {
        super(_nome, _idade, _alimentado);
        this.local = _local;
    }
}
