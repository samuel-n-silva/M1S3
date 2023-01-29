package exercicios.exercicio_dois;

public class Pessoa {
    private String nome;
    private String endereco;

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    private void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Pessoa(String _nome, String _endereco) {
        this.setNome(_nome);
        this.setEndereco(_endereco);
    }
}
