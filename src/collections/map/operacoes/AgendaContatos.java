package collections.map.operacoes;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap; // Map para armazenar contatos (nome -> telefone)

    // Construtor da classe AgendaContatos
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>(); // Inicializa o map como um HashMap
    }

    // Método para adicionar um contato à agenda
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone); // Adiciona o contato ao map
    }

    // Método para remover um contato da agenda pelo nome
    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome); // Remove o contato pelo nome
        }
    }

    // Método para exibir todos os contatos da agenda
    public void exibirContato() {
        System.out.println(agendaContatoMap); // Exibe todos os contatos no map
    }

    // Método para pesquisar o número de telefone por nome
    public Integer perquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome); // Obtém o número de telefone pelo nome
        }
        return numeroPorNome;
    }

    // Método main para demonstrar o uso da classe AgendaContatos
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos(); // Cria uma instância da classe AgendaContatos

        // Adiciona contatos à agenda
        agendaContatos.adicionarContato("Douglas", 123456789);
        agendaContatos.adicionarContato("Douglas", 987654321); // Substitui o contato anterior com o mesmo nome
        agendaContatos.adicionarContato("Douglas Ferreira", 111111);
        agendaContatos.adicionarContato("João", 78946512);

        // Exibe todos os contatos na agenda
        agendaContatos.exibirContato();

        // Remove um contato da agenda
        agendaContatos.removerContato("João");
        agendaContatos.exibirContato();

        // Pesquisa o número de telefone pelo nome
        System.out.println("O número é: " + agendaContatos.perquisarPorNome("Douglas Ferreira"));
    }
}
