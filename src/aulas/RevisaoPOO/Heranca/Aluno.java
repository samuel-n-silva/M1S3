package aulas.RevisaoPOO.Heranca;

public class Aluno extends Pessoa{
    public String curso;
    public int semestre;

    public Aluno(String _nomeCompleto, int _idade, int _matricula, String _cpf, String _cep,String _curso, int _semestre){
        super(_nomeCompleto, _idade, _matricula, _cpf, _cep);
        this.curso = _curso;
        this.semestre = _semestre;
    }
}
