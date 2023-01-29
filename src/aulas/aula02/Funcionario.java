package aulas.aula02;

public class Funcionario extends Pessoa{
    public double salario;
    public String cargo;

    public Funcionario(String _nomeCompleto, String _cpf, double _salario, String _cargo) {
        super(_nomeCompleto, _cpf);
        this.salario = _salario;
        this.cargo = _cargo;
    }
}
