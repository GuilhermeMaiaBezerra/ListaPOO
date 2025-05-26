public class CarrinhoDeCompras {
    private Produto[] produtos;
    private int totalItens;

    public CarrinhoDeCompras(int capacidade) {
        produtos = new Produto[capacidade];
        totalItens = 0;
    }

    public boolean adicionarProduto(Produto produto) {
        if (totalItens < produtos.length) {
            produtos[totalItens] = produto;
            totalItens++;
            return true;
        }
        return false;
    }

    public boolean removerProduto(String nomeProduto) {
        for (int i = 0; i < totalItens; i++) {
            if (produtos[i].getNome().equalsIgnoreCase(nomeProduto)) {
                for (int j = i; j < totalItens - 1; j++) {
                    produtos[j] = produtos[j + 1];
                }
                produtos[totalItens - 1] = null;
                totalItens--;
                return true;
            }
        }
        return false;
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < totalItens; i++) {
            total += produtos[i].getTotal();
        }
        return total;
    }

    public void listarCarrinho() {
        System.out.println("\n--- Itens no Carrinho ---");
        if (totalItens == 0) {
            System.out.println("Carrinho vazio.");
        } else {
            for (int i = 0; i < totalItens; i++) {
                produtos[i].exibirProduto();
            }
            System.out.println("Total da compra: R$ " + calcularTotal());
        }
    }
}
