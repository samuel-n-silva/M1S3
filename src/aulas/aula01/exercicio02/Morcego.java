package aulas.aula01.exercicio02;

import aulas.aula01.exercicio02.Heranca.Mamifero;

public class Morcego extends Mamifero {
    public String local;

    public Morcego(String _nome, int _idade, String _castrado, String _local) {
        super(_nome, _idade, _castrado);
        this.local = _local;
    }
}
