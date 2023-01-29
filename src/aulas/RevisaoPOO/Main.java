package aulas.RevisaoPOO;

import aulas.RevisaoPOO.Heranca.Aluno;
import exercicios.exercicio_tres.Pessoa;

public class Main {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Samuel nunes", 25, 23312, "923012301","23212312-12", "Estudante", 1);
        System.out.println(aluno01.nomeCompleto);
    }
}
