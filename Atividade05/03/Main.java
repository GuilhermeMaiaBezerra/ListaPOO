import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pedido pedido = new Pedido(10);

        System.out.println("=== Sistema de Pedidos ===");
        char opcao;

        do {
            System.out.print("\nDigite o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o preço do produto: ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // limpar buffer

            Produto p = new Produto(nome, preco);
            pedido.adicionarProduto(p);

            System.out.print("Deseja adicionar outro produto? (s/n): ");
            opcao = scanner.nextLine().toLowerCase().charAt(0);

        } while (opcao == 's');

        pedido.exibirPedido();

        scanner.close();
    }
}
