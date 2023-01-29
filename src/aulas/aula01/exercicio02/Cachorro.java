package aulas.aula01.exercicio02;

import aulas.aula01.exercicio02.Heranca.Mamifero;

public class Cachorro extends Mamifero {
    public String treinado;

    public Cachorro(String _nome, int _idade, String _castrado, String _treinado) {
        super(_nome, _idade, _castrado);
        this.treinado = _treinado;
    }
}
