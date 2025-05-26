public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 3000.0, 5);
        Produto produto2 = new Produto("Mouse", 80.0, 10);
        Produto produto3 = new Produto("Teclado", 150.0, 8);

        Cliente cliente = new Cliente("Guilherme", "gbmaia1000@gmail.com", "Rua das Flores");

        Pedido pedido = new Pedido(cliente);
        pedido.adicionarProduto(produto1, 6);
        pedido.adicionarProduto(produto2, 2);
        pedido.adicionarProduto(produto3, 1);

        pedido.exibirPedido();
    }
}
