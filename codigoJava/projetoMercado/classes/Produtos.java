package projetoMercado.classes;

public class Produtos {
    protected String nome;
    protected int codigo;
    protected double valor;

    public Produtos(String nome, int codigo, double valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
    }
    public Produtos(double valor) {
        this.valor = valor;
    }
}
