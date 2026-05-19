package main.java.list.OperBasicas.listaCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Itens> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade, double preco){
        carrinho.add(new Itens(nome, quantidade, preco));
    }

    public void removerItem(String nome){
        List<String> itemParaRemover = new ArrayList<>();

        for (Itens compras : carrinho){
            if (compras.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(nome);
            }
        }

        carrinho.removeAll(itemParaRemover);
    }

    public double calcularValorTotal(){
        int total = 0;
        for (Itens valor : carrinho){
            total += valor.getPreco();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

    static void main(String[] args) {

    }
}
