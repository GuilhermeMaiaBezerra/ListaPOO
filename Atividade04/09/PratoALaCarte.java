public class PratoALaCarte extends ItemCardapio {
    private String descricao;

    public PratoALaCarte(String nome, double preco, String descricao) {
        super(nome, preco);
        this.descricao = descricao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("PRATO À LA CARTE");
        System.out.println("- Nome: " + nome);
        System.out.println("- Preço: R$ " + preco);
        System.out.println("- Descrição: " + descricao);
    }
}
