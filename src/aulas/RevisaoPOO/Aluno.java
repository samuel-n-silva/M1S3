package aulas.RevisaoPOO;

public class Aluno {

    private String nomeCompleto;
    private int idade;
    private int matricula;
    private int turma;
    private String cpf;
    private int cep;


    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public int getIdade() {
        return idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getTurma() {
        return turma;
    }

    public String getCpf() {
        return cpf;
    }

    public int getCep() {
        return cep;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

}
