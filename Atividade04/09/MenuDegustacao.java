public class MenuDegustacao extends ItemCardapio {
    private int quantidadePratos;

    public MenuDegustacao(String nome, double preco, int quantidadePratos) {
        super(nome, preco);
        this.quantidadePratos = quantidadePratos;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("MENU DEGUSTAÇÃO");
        System.out.println("- Nome: " + nome);
        System.out.println("- Quantidade de pratos: " + quantidadePratos);
        System.out.println("- Preço: R$ " + preco);
        System.out.println("- Uma experiência gastronômica exclusiva!");
    }
}
