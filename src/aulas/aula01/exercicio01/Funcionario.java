package aulas.aula01;

import aulas.aula01.Heranca.Pessoa;

public class Funcionario extends Pessoa {
    public double salario;
    public String cargo;

    public Funcionario(String _nomeCompleto, String _cpf, int _idade, double salario, String cargo) {
        super(_nomeCompleto, _cpf, _idade);
        this.salario = salario;
        this.cargo = cargo;
    }
}
