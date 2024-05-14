package collections.map.ordenacao.evento;

public class Evento {
    // Atributos da classe Evento
    private String nome;
    private String atracao;

    // Construtor da classe Evento
    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    // Método getter para obter o nome do evento
    public String getNome() {
        return nome;
    }

    // Método getter para obter a atração do evento
    public String getAtracao() {
        return atracao;
    }

    // Método toString para representar textualmente um objeto Evento
    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }
}
