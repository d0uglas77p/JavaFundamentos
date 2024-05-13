package collections.list.operacoes;

import java.util.ArrayList;
import java.util.List;

// Classe ListaTarefa para gerenciar uma lista de tarefas.
public class ListaTarefa {

    private List<Tarefa> tarefaList; // Lista para armazenar as tarefas.

    // Construtor que inicializa a lista de tarefas como ArrayList.
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // Método para adicionar uma nova tarefa à lista.
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao)); // Cria uma nova tarefa e a adiciona à lista.
    }

    // Método para remover uma tarefa da lista com base na descrição (ignorando maiúsculas/minúsculas).
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t); // Adiciona tarefa à lista de tarefas para remover.
            }
        }
        tarefaList.removeAll(tarefasParaRemover); // Remove todas as tarefas da lista principal.
    }

    // Método para obter o número total de tarefas na lista.
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    // Método para imprimir as descrições de todas as tarefas na lista.
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    // Método principal para demonstrar o uso da ListaTarefa.
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        // Imprime o número total de elementos na lista (inicialmente zero).
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        // Adiciona algumas tarefas à lista.
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");

        // Imprime o número total de elementos na lista após adicionar tarefas.
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        // Remove algumas tarefas da lista.
        listaTarefa.removerTarefa("Tarefa 1");
        listaTarefa.removerTarefa("Tarefa 2");

        // Imprime o número total de elementos na lista após remover tarefas.
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        // Imprime as descrições das tarefas restantes na lista.
        listaTarefa.obterDescricoesTarefas();
    }
}