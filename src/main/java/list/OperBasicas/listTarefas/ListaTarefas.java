package main.java.list.OperBasicas.listTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    //Objeto criado com tipo generico
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
        //Objeto de Tarefa criado e passado como parametro do add
        //descricao sendo passada como parametro do objeto criado Tarefa
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaemover = new ArrayList<>();
        for (Tarefa tarefa: tarefaList){
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefaParaemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas tasks = new ListaTarefas();

        tasks.adicionarTarefa("1");
        tasks.adicionarTarefa("2");
        tasks.adicionarTarefa("3");

        tasks.obterDescricoesTarefas();
        System.out.println(tasks.obterNumeroTotalTarefas());

        tasks.removerTarefa("3");
        tasks.obterDescricoesTarefas();
    }
}

