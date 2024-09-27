public class Biblioteca {
    private String nome;
    private String[] livros;

    public Biblioteca() {
        this.nome = "Biblioteca Desconhecida";
        this.livros = new String[10];
    }

    public Biblioteca(String nome, String[] livros) {
        this.nome = nome;
        if (livros.length == 10) {
            this.livros = livros;
        } else {
            this.livros = new String[10];
        }
    }

    public void imprimirLivros() {
        System.out.println("Nome da Biblioteca: " + this.nome);
        System.out.println("Livros:");
        for (String livro : this.livros) {
            if (livro != null) {
                System.out.println(livro);
            }
        }
    }

    public String contarLivrosDisponiveis() {
        int contador = 0;
        for (String livro : this.livros) {
            if (livro != null) {
                contador++;
            }
        }
        ;
        return "Quantidade de livros: " + contador;
    }

    public boolean verificarDisponibilidade(String nomeLivro) {
        for (String livro : this.livros) {
            if (livro != null && livro.equals(nomeLivro)) {
                System.out.println(nomeLivro + " está disponível");
                return true; // Livro encontrado
            }
        }
        System.out.println(nomeLivro + " não está disponível");
        return false; // Livro não encontrado
    }

    public static void main(String[] args) {
        Biblioteca biblioteca1 = new Biblioteca();
        biblioteca1.imprimirLivros();
        System.out.println(biblioteca1.contarLivrosDisponiveis());
        System.out.println(biblioteca1.verificarDisponibilidade("Java Básico"));

        String[] livros = {"Java Básico", "Estruturas de Dados", "Algoritmos", null, "Banco de Dados", null, null, null, null, "Sistemas Operacionais"};
        Biblioteca biblioteca2 = new Biblioteca("Biblioteca Central", livros);
        biblioteca2.imprimirLivros();
        System.out.println(biblioteca2.contarLivrosDisponiveis());
        System.out.println(biblioteca2.verificarDisponibilidade("Java Básico"));
        System.out.println(biblioteca2.verificarDisponibilidade("Inteligência Artificial"));
    }
}

