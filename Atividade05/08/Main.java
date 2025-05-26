import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static CarrinhoDeCompras carrinho = new CarrinhoDeCompras(10);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n=== MENU CARRINHO ===");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Listar carrinho");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1 -> adicionarProduto();
                case 2 -> removerProduto();
                case 3 -> carrinho.listarCarrinho();
                case 4 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 4);
    }

    static void adicionarProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        Produto produto = new Produto(nome, preco, quantidade);
        if (carrinho.adicionarProduto(produto)) {
            System.out.println("Produto adicionado com sucesso!");
        } else {
            System.out.println("Carrinho cheio! Não foi possível adicionar.");
        }
    }

    static void removerProduto() {
        System.out.print("Nome do produto para remover: ");
        String nome = scanner.nextLine();
        if (carrinho.removerProduto(nome)) {
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado no carrinho.");
        }
    }
}
