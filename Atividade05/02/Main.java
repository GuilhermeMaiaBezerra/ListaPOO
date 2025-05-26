import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Produto> produtos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;
        do {
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Adicionar ao estoque");
            System.out.println("3 - Remover do estoque");
            System.out.println("4 - Relatório estoque");
            System.out.println("5 - Sair");
            System.out.print("Digite o código: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> cadastrarProduto();
                case 2 -> adicionarEstoque();
                case 3 -> removerEstoque();
                case 4 -> mostrarDados();
                case 5 -> System.out.println("Saindo...");
                default -> System.out.println("Código inválido.");
            }

        } while (opcao != 5);
    }

    static void cadastrarProduto() {
        int codigo, qtd;
        double preco;
        String nome;

        System.out.println("\n--- Cadastro Produto ---");

        while (true) {
            System.out.print("Código: ");
            if (scanner.hasNextInt()) {
                codigo = scanner.nextInt();
                break;
            } else {
                System.out.println("Código inválido!");
                scanner.nextLine();
            }
        }

        scanner.nextLine(); // limpar buffer
        while (true) {
            System.out.print("Nome: ");
            nome = scanner.nextLine();
            if (!nome.isEmpty()) break;
            System.out.println("Nome não pode ser vazio!");
        }

        while (true) {
            System.out.print("Preço: ");
            if (scanner.hasNextDouble()) {
                preco = scanner.nextDouble();
                break;
            } else {
                System.out.println("Preço inválido!");
                scanner.nextLine();
            }
        }

        while (true) {
            System.out.print("Quantidade: ");
            if (scanner.hasNextInt()) {
                qtd = scanner.nextInt();
                break;
            } else {
                System.out.println("Quantidade inválida!");
                scanner.nextLine();
            }
        }

        produtos.add(new Produto(codigo, nome, preco, qtd));
        System.out.println("Produto cadastrado com sucesso!");
    }

    static Produto buscarProduto(int codigo) {
        for (Produto p : produtos) {
            if (p.codigo == codigo) {
                return p;
            }
        }
        return null;
    }

    static void adicionarEstoque() {
        System.out.print("Código do produto: ");
        int codigo = scanner.nextInt();
        Produto p = buscarProduto(codigo);
        if (p != null) {
            System.out.print("Quantidade para adicionar: ");
            int qtd = scanner.nextInt();
            p.adicionarEstoque(qtd);
            System.out.println("Estoque atualizado.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    static void removerEstoque() {
        System.out.print("Código do produto: ");
        int codigo = scanner.nextInt();
        Produto p = buscarProduto(codigo);
        if (p != null) {
            System.out.print("Quantidade para remover: ");
            int qtd = scanner.nextInt();
            p.removerEstoque(qtd);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    static void mostrarDados() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto p : produtos) {
                p.exibirDados();
            }
        }
    }
}
