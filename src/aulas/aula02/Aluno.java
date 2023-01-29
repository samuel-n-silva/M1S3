package aulas.aula02;

public class Aluno extends Pessoa{
    public String turma;
    public String semestre;
    public Aluno(String _nomeCompleto, String _cpf, String _turma, String _semestre) {
        super(_nomeCompleto, _cpf);
        this.turma = _turma;
        this.semestre = _semestre;
    }
}
