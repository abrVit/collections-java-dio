package main.java.list.Pesquisa.Livros;

public class Livro {

    private String autor, titulo;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return titulo + " -> " + autor + ": " + anoPublicacao;
    }
}
