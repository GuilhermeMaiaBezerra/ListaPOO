import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos;
    private double valorTotal;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (produto.comprar(quantidade)) {
            for (int i = 0; i < quantidade; i++) {
                produtos.add(produto);
                valorTotal += produto.getPreco();
            }
        }
    }

    public void calcularTotal() {
        
        valorTotal = 0;
        for (Produto p : produtos) {
            valorTotal += p.getPreco();
        }
    }

    public void exibirPedido() {
        System.out.println("\n--- Pedido ---");
        cliente.exibirDados();
        System.out.println("Produtos:");
        for (Produto p : produtos) {
            System.out.println("- " + p.getNome() + " | R$" + p.getPreco());
        }
        System.out.println("Total: R$" + valorTotal);
    }
}
