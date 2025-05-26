import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca(10); // capacidade para até 10 livros

        int opcao;
        do {
            System.out.println("\n=== MENU BIBLIOTECA ===");
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Buscar Livro por Título");
            System.out.println("3 - Listar Todos os Livros");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1 -> {
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();

                    Livro novoLivro = new Livro(titulo, autor, isbn);
                    biblioteca.adicionarLivro(novoLivro);
                }
                case 2 -> {
                    System.out.print("Digite o título do livro: ");
                    String busca = scanner.nextLine();
                    Livro encontrado = biblioteca.buscarPorTitulo(busca);
                    if (encontrado != null) {
                        System.out.println("\nLivro encontrado:");
                        encontrado.exibirInfo();
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                }
                case 3 -> biblioteca.listarLivros();
                case 4 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
