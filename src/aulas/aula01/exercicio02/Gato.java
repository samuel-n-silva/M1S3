package aulas.aula01.exercicio02;

import aulas.aula01.exercicio02.Heranca.Mamifero;

public class Gato extends Mamifero {
    public String adodato;

    public Gato(String _nome, int _idade, String _castrado, String _adodato) {
        super(_nome, _idade, _castrado);
        this.adodato = _adodato;
    }
}
