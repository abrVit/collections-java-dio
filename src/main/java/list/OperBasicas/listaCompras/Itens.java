package main.java.list.OperBasicas.listaCompras;

public class Itens {

    private String nome;
    private int quantidade;
    private double preco;

    public Itens(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " -> " + quantidade + "R$" + preco +"\n";
    }
}
