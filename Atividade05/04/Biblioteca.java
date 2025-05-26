public class Biblioteca {
    private Livro[] livros;
    private int quantidade;

    public Biblioteca(int capacidadeMaxima) {
        livros = new Livro[capacidadeMaxima];
        quantidade = 0;
    }

    public boolean adicionarLivro(Livro livro) {
        if (quantidade < livros.length) {
            livros[quantidade] = livro;
            quantidade++;
            return true;
        } else {
            System.out.println("A biblioteca está cheia!");
            return false;
        }
    }

    public Livro buscarPorTitulo(String titulo) {
        for (int i = 0; i < quantidade; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                return livros[i];
            }
        }
        return null;
    }

    public void listarLivros() {
        if (quantidade == 0) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("\n--- Lista de Livros ---");
            for (int i = 0; i < quantidade; i++) {
                livros[i].exibirInfo();
            }
        }
    }
}
