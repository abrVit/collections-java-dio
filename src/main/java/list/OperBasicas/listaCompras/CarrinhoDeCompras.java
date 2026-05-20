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
        for (Itens item : carrinho){
            if (item.getNome().equalsIgnoreCase(nome)) {
                int index = carrinho.lastIndexOf(item);
                carrinho.remove(index);
            }
        }
    }

    public double calcularValorTotal(){
        double total = 0;
        for (Itens value : carrinho){
            double preco = value.getPreco();
            int quant = value.getQuantidade();
            double val = preco * quant;
            total += val;
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras shop = new CarrinhoDeCompras();
        shop.adicionarItem("Cola tudo", 10, 7.97);
        shop.adicionarItem("Refrigerante", 4, 12);
        shop.adicionarItem("Refrigerante", 4, 12);
        System.out.println(shop.calcularValorTotal());
        shop.exibirItens();
        shop.removerItem("Refrigerante");
        shop.exibirItens();
        System.out.println(shop.calcularValorTotal());
    }
}
