package main.java.list.OperBasicas.listTarefas;

//Elemento ciado para ser incluido na classe ListaTarefas

public class Tarefa {

    private String descricao;

    public Tarefa() {
    }

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}

