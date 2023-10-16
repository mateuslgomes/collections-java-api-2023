package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    List<Tarefa> tarefaList;

    public ListaTarefa() { this.tarefaList = new ArrayList<>(); }

    public void adicionarTarefa(String tarefa) {
        this.tarefaList.add(new Tarefa(tarefa));
    }

    public void removerTarefa(String descricao) {
        tarefaList.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao));
    }

    public int obterNumeroTotalTarefas() { return tarefaList.size(); }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 4");
        listaTarefa.adicionarTarefa("Tarefa 5");

        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("tarefa 3");

        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();
    }

}
