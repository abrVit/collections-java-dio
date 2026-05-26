package main.java.list.Pesquisa.Livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> livrosPAutor = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro livro : listaLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPAutor.add(livro);
                }
            }
            return livrosPAutor;
        } else {
            throw new RuntimeException("Lista esta vazia!");
        }
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> publisAno = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro anoPubli : listaLivros) {
                if (anoInicial >= anoPubli.getAnoPublicacao() && anoPubli.getAnoPublicacao() <= anoFinal) {
                    publisAno.add(anoPubli);
                }
            }
            return publisAno;
        } else {
            throw new RuntimeException("Lista esta vazia!");
        }
    }

    public Livro pesquisaPorTitulo(String titulo){
        if (!listaLivros.isEmpty()){
            for (Livro titulos : listaLivros){
                if (titulos.getTitulo().equalsIgnoreCase(titulo)){
                    return titulos;
                }
            }
        } else {
            throw new RuntimeException("Lista esta vazia!");
        }
        return null;
    }
}
