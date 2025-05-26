import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();

        System.out.println("Categorias disponíveis:");
        for (Categoria cat : Categoria.values()) {
            System.out.println("- " + cat);
        }

        System.out.print("Escolha uma categoria (digite exatamente como acima): ");
        String catInput = scanner.nextLine().toUpperCase();

        try {
            Categoria categoria = Categoria.valueOf(catInput);

            Livro livro = new Livro(titulo, autor, categoria);
            System.out.println("\nLivro cadastrado com sucesso:");
            System.out.println(livro);

        } catch (IllegalArgumentException e) {
            System.out.println("Categoria inválida! Livro não cadastrado.");
        }

        scanner.close();
    }
}
