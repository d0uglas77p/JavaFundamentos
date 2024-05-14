package collections.set.pesquisa.contato;

import java.util.HashSet;
import java.util.Set;

public class AgendaContados {

    private Set<Contato> contatoSet;

    // Construtor para inicializar o conjunto de contatos
    public AgendaContados() {
        this.contatoSet = new HashSet<>();
    }

    // Método para adicionar um novo contato ao conjunto
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    // Método para exibir todos os contatos presentes no conjunto
    public void exibirContato() {
        System.out.println(contatoSet);
    }

    // Método para pesquisar contatos por nome
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) { // Verifica se o nome do contato começa com o nome fornecido
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    // Método para atualizar o número de telefone de um contato pelo nome
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) { // Verifica se o nome do contato corresponde (ignorando maiúsculas/minúsculas)
                c.setNumero(novoNumero); // Atualiza o número do contato
                contatoAtualizado = c; // Atribui o contato atualizado
                break;
            }
        }
        return contatoAtualizado; // Retorna o contato atualizado (ou null se não encontrado)
    }

    public static void main(String[] args) {
        AgendaContados agendaContados = new AgendaContados();

        agendaContados.exibirContato(); // Exibe os contatos presentes na agenda (vazio inicialmente)

        // Adiciona alguns contatos à agenda
        agendaContados.adicionarContato("Douglas", 123456789);
        agendaContados.adicionarContato("Douglas", 1234); // Mesmo nome, número diferente
        agendaContados.adicionarContato("Douglas Ferreira", 987654321);
        agendaContados.adicionarContato("João", 101001110);

        agendaContados.exibirContato(); // Exibe os contatos atualizados na agenda

        // Pesquisa contatos por nome
        System.out.println(agendaContados.pesquisarPorNome("João"));

        // Atualiza o número de telefone de um contato e exibe o contato atualizado
        System.out.println("Contato atualizado: " + agendaContados.atualizarNumeroContato("João", 7777777));
    }
}