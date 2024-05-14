package collections.set.pesquisa.tarefa;

public class Tarefa {
    // Atributos da classe Tarefa
    private String descricao; // Descrição da tarefa
    private boolean concluida; // Indica se a tarefa foi concluída ou não

    // Construtor da classe Tarefa
    public Tarefa(String descricao) {
        this.descricao = descricao; // Inicializa a descrição da tarefa com o valor fornecido
        this.concluida = false; // Define a tarefa como não concluída ao ser criada
    }

    // Método para obter a descrição da tarefa
    public String getDescricao() {
        return descricao;
    }

    // Método para verificar se a tarefa está concluída
    public boolean isConcluida() {
        return concluida;
    }

    // Método para definir a descrição da tarefa
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método para definir o status de conclusão da tarefa
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    // Método toString para retornar uma representação em string da tarefa
    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
