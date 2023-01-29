package aulas.aula02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa alu01 = new Aluno("Samuel nunes","223123123","A1","1º Semestre");
        Pessoa prof01 = new Funcionario("Fernando","23123123",4555,"Professor");

        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        listaPessoas.add(alu01);
        listaPessoas.add(prof01);

        System.out.println(listaPessoas.get(1));
    }
}
