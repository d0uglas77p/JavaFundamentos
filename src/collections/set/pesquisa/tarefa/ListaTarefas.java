package collections.set.pesquisa.tarefa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    // Atributo para armazenar as tarefas como um conjunto de Tarefa
    private Set<Tarefa> tarefasSet;

    // Construtor da classe ListaTarefas que inicializa o conjunto de tarefas
    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    // Método para adicionar uma nova tarefa ao conjunto
    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao)); // Cria uma nova instância de Tarefa com a descrição fornecida e a adiciona ao conjunto
    }

    // Método para remover uma tarefa com base na descrição
    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefasSet.isEmpty()) {
            // Percorre as tarefas no conjunto para encontrar a tarefa com a descrição fornecida
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefasSet.remove(tarefaParaRemover); // Remove a tarefa do conjunto
        } else {
            System.out.println("O conjunto está vazio");
        }

        if (tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    // Método para exibir todas as tarefas no conjunto
    public void exibirTarefas() {
        if (!tarefasSet.isEmpty()) {
            System.out.println(tarefasSet); // Exibe todas as tarefas presentes no conjunto
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    // Método para contar o número de tarefas no conjunto
    public int contarTarefas() {
        return tarefasSet.size(); // Retorna o tamanho do conjunto, que representa o número de tarefas
    }

    // Método para obter as tarefas concluídas no conjunto
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefasSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t); // Adiciona a tarefa concluída ao conjunto de tarefas concluídas
            }
        }
        return tarefasConcluidas; // Retorna o conjunto de tarefas concluídas
    }

    // Método para obter as tarefas pendentes (não concluídas) no conjunto
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for (Tarefa t : tarefasSet) {
            if (!t.isConcluida()) {
                tarefasNaoConcluidas.add(t); // Adiciona a tarefa pendente ao conjunto de tarefas não concluídas
            }
        }
        return tarefasNaoConcluidas; // Retorna o conjunto de tarefas não concluídas
    }

    // Método para marcar uma tarefa como concluída com base na descrição
    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true); // Marca a tarefa como concluída se encontrar a descrição correspondente
            }
        }
    }

    // Método para marcar uma tarefa como pendente (não concluída) com base na descrição
    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }

        if (tarefaParaMarcarComoPendente != null) {
            if (tarefaParaMarcarComoPendente.isConcluida()) {
                tarefaParaMarcarComoPendente.setConcluida(false); // Marca a tarefa como pendente se estiver concluída
            }
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    // Método para limpar todas as tarefas do conjunto
    public void limparListaTarefas() {
        if (tarefasSet.isEmpty()) {
            System.out.println("A lista já está vazia!");
        } else {
            tarefasSet.clear(); // Remove todas as tarefas do conjunto
        }
    }

    // Método principal para demonstrar o uso da classe ListaTarefas
    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa da lista
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo e exibindo tarefas pendentes na lista
        System.out.println("Tarefas Pendentes: " + listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo e exibindo tarefas concluídas na lista
        System.out.println("Tarefas Concluídas: " + listaTarefas.obterTarefasConcluidas());

        // Marcando uma tarefa como pendente
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
