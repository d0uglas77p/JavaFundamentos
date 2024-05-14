package collections.list.operacoes.tarefa;

// Classe Tarefa representa uma única tarefa com uma descrição.
public class Tarefa {

    private String descricao;

    // Construtor para inicializar a descrição da tarefa.
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    // Método para obter a descrição da tarefa.
    public String getDescricao() {
        return descricao;
    }

    // Sobrescrita do método toString para retornar a descrição da tarefa ao imprimir o objeto.
    @Override
    public String toString() {
        return descricao;
    }
}
