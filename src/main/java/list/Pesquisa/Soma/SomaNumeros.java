package main.java.list.Pesquisa.Soma;

import java.util.*;

public class SomaNumeros {

    List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int num){listaNumeros.add(num);}

    public int calcularSoma(){
        int result = 0;
        for (int num : listaNumeros) {
            result += num;
        }
        return result;
    }

    public int encontrarMaiorNumero(){
        int maiorNum = listaNumeros.get(0);
        int j = listaNumeros.size();
        if (!listaNumeros.isEmpty()) {
            for (int i = 0; i < j; i++) {
                if (maiorNum < listaNumeros.get(i)) {
                    maiorNum = listaNumeros.get(i);
                }
            }
            return maiorNum;
        } else {
            throw new RuntimeException("Lista esta vazia");
        }
    }

    public int enocntrarMenorNumero(){
        int menorNum = listaNumeros.get(0);
        int n = listaNumeros.size();
        if (!listaNumeros.isEmpty()) {
            for (int i = 0; i < n; i++) {
                if (menorNum > listaNumeros.get(i)) {
                    menorNum = listaNumeros.get(i);
                }
            }
            return menorNum;
        } else {
            throw new RuntimeException("Lista esta vazia");
        }
    }

    public void exibirNumeros() {
        if (listaNumeros.isEmpty()) {
            System.out.println("Lista Vazia");
        } else {
            System.out.println(this.listaNumeros);
        }
    }


    public static void main(String[] args){
        SomaNumeros lista = new SomaNumeros();
        lista.adicionarNumero(10);
        lista.adicionarNumero(20);
        lista.adicionarNumero(-45);
        lista.adicionarNumero(5);
        lista.adicionarNumero(60);
        lista.adicionarNumero(80);
        lista.adicionarNumero(70);
        lista.adicionarNumero(15);

        lista.exibirNumeros();
        System.out.println(lista.calcularSoma());
        System.out.println(lista.enocntrarMenorNumero());
        System.out.println(lista.encontrarMaiorNumero());
    }
}
