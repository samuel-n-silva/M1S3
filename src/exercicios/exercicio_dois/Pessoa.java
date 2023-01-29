package exercicios.exercicio_dois;

public class Pessoa {
    protected String nome;
    protected String endereco;

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getEndereco() {
        return endereco;
    }

    protected void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    protected Pessoa(String _nome, String _endereco) {
        this.setNome(_nome);
        this.setEndereco(_endereco);
    }
}
