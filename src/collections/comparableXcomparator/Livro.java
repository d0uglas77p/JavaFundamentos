package collections.comparableXcomparator;

// Classe 'Livro' que implementa Comparable para definir uma ordem natural de classificação (por título)
class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private int ano;

    // Construtor para inicializar um livro com título, autor e ano
    public Livro(String ti, String au, int an) {
        this.titulo = ti;
        this.autor = au;
        this.ano = an;
    }

    // Método compareTo para comparar livros por título
    @Override
    public int compareTo(Livro l) {
        return titulo.compareTo(l.titulo);
    }

    // Métodos getters para acessar os atributos privados
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }
}