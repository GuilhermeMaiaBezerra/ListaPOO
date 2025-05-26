public class Pedido {
    private Produto[] produtos;
    private int quantidade;

    public Pedido(int tamanhoMaximo) {
        produtos = new Produto[tamanhoMaximo];
        quantidade = 0;
    }

    public boolean adicionarProduto(Produto produto) {
        if (quantidade < produtos.length) {
            produtos[quantidade] = produto;
            quantidade++;
            return true;
        } else {
            System.out.println("Não é possível adicionar mais produtos.");
            return false;
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < quantidade; i++) {
            total += produtos[i].getPreco();
        }
        return total;
    }

    public void exibirPedido() {
        System.out.println("\n--- Produtos no Pedido ---");
        for (int i = 0; i < quantidade; i++) {
            produtos[i].exibirInfo();
        }
        System.out.println("Total da compra: R$" + calcularTotal());
    }
}
