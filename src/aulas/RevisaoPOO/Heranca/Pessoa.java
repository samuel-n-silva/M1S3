package aulas.RevisaoPOO;

public class Pessoa {
    public String nomeCompleto;
    public int idade;
    public int matricula;
    public String cpf;
    public String cep;

    public Pessoa(String _nomeCompleto, int _idade, int _matricula, String _cpf, String _cep) {
        this.nomeCompleto = _nomeCompleto;
        this.idade = _idade;
        this.matricula = _matricula;
        this.cpf = _cpf;
        this.cep = _cep;
    }
}
