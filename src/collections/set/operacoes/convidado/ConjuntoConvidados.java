package collections.set.operacoes.convidado;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    // Construtor para inicializar o conjunto de convidados
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    // Método para adicionar um novo convidado ao conjunto
    public void adicionarConvidade(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    // Método para remover um convidado do conjunto com base no código de convite
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    // Método para contar o número de convidados no conjunto
    public int contarConvidados() {
        return convidadoSet.size();
    }

    // Método para exibir todos os convidados presentes no conjunto
    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    // Método principal para demonstrar o uso da classe ConjuntoConvidados
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        // Exibe a quantidade inicial de convidados
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");

        // Adiciona alguns convidados ao conjunto
        conjuntoConvidados.adicionarConvidade("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidade("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidade("Convidado 3", 1235); // Código de convite duplicado
        conjuntoConvidados.adicionarConvidade("Convidado 4", 1237);

        // Exibe os convidados presentes no conjunto
        conjuntoConvidados.exibirConvidados();

        // Exibe o número atual de convidados no conjunto
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");
    }
}