package main.java.list.Pesquisa.Livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {


    public static void main(String[] args) {
        CatalogoLivros livros = new CatalogoLivros();
        livros.adicionarLivro("Livro 1", "Autor 1", 2019);
        livros.adicionarLivro("Livro 2", "Autor 2", 2025);
        livros.adicionarLivro("Livro 3", "Autor 2", 1990);
        livros.adicionarLivro("Livro 4", "Autor 4", 2020);
        livros.adicionarLivro("Livro 3", "Autor 5", 2017);

        List<Livro> livroPorAno = livros.pesquisarPorIntervaloAnos(2014, 2026);
        System.out.println(livroPorAno);

        System.out.println(livros.pesquisaPorAutor("autor 2"));
        System.out.println(livros.pesquisaPorTitulo("livro 3"));
    }

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
                if (anoInicial <= anoPubli.getAnoPublicacao() && anoPubli.getAnoPublicacao() <= anoFinal) {
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
