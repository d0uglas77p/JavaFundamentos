package collections.set.ordenacao.aluno;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    // Atributos da classe GerenciadorAlunos
    private Set<Aluno> alunosSet;  // Conjunto de alunos

    // Construtor da classe GerenciadorAlunos
    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();  // Inicializa o conjunto de alunos como um HashSet
    }

    // Método para adicionar um aluno ao conjunto
    public void adicionarAluno(String nome, Long matricula, double media) {
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    // Método para remover um aluno do conjunto com base na matrícula
    public void removerAlunoPorMatricula(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunosSet.isEmpty()) {
            // Procura o aluno com a matrícula especificada
            for (Aluno a : alunosSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            // Remove o aluno do conjunto
            alunosSet.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }

        if (alunoParaRemover == null) {
            System.out.println("Matrícula não encontrada!");
        }
    }

    // Método para exibir os alunos ordenados por nome (usando TreeSet)
    public void exibirAlunosPorNome() {
        // Cria um TreeSet passando o conjunto de alunos (ordem natural por nome)
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        if (!alunosSet.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    // Método para exibir os alunos ordenados por nota (usando TreeSet com Comparator)
    public void exibirAlunosPorNota() {
        // Cria um TreeSet passando um ComparatorNota (ordem personalizada por média)
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if (!alunosSet.isEmpty()) {
            // Adiciona todos os alunos do conjunto ao TreeSet (ordenado por média)
            alunosPorNota.addAll(alunosSet);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    // Método main para demonstrar o uso da classe GerenciadorAlunos
    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunosSet);

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAlunoPorMatricula(000L);
        gerenciadorAlunos.removerAlunoPorMatricula(123457L);
        System.out.println(gerenciadorAlunos.alunosSet);

        // Exibindo alunos ordenados por nome
        System.out.println("Alunos ordenados por nome:");
        gerenciadorAlunos.exibirAlunosPorNome();

        // Exibindo alunos ordenados por nota
        System.out.println("Alunos ordenados por nota:");
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
