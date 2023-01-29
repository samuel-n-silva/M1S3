package exercicios.exercicio_cinco;

public class Carro {

    private String marca;
    private String tipo;
    private String combustivel;
    private String categoria;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public int ano() {
        return ano;
    }

    public void ano(int ano) {
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Carro(String marca, String tipo, String combustivel, String categoria, int ano) {
        this.marca = marca;
        this.tipo = tipo;
        this.combustivel = combustivel;
        this.categoria = categoria;
        this.ano = ano;
    }
}
