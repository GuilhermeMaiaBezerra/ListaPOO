public class ComboPromocional extends ItemCardapio {
    private String itens;
    private double desconto;

    public ComboPromocional(String nome, double preco, String itens, double desconto) {
        super(nome, preco);
        this.itens = itens;
        this.desconto = desconto;
    }

    public double getPrecoComDesconto() {
        return preco - (preco * desconto / 100);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("COMBO PROMOCIONAL");
        System.out.println("- Nome: " + nome);
        System.out.println("- Itens: " + itens);
        System.out.println("- Preço original: R$ " + preco);
        System.out.println("- Desconto: " + desconto + "%");
        System.out.println("- Preço com desconto: R$ " + getPrecoComDesconto());
    }
}
