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

    public Livro pesquisaPorAutor(String autor){
        for (Livro livro : listaLivros){
            if (livro.getAutor().equalsIgnoreCase(autor)){
                return livro;
            }
        }
        return null;
    }

    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> publisAno = new ArrayList<>();

        for (Livro anoPubli : listaLivros){
            if (anoInicial < anoPubli.getAnoPublicacao() && anoPubli.getAnoPublicacao()< anoFinal){
                publisAno.add(anoPubli);
            }
        }
        System.out.println(publisAno);
    }

    public Livro pesquisaPorTitulo(String titulo){
        for (Livro titulos : listaLivros){
            if (titulos.getTitulo().equalsIgnoreCase(titulo)){
                return titulos;
            }
        }
        return null;
    }
}
