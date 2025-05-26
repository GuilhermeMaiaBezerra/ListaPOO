public class PacoteEconomico extends PacoteViagem {

    public PacoteEconomico(String destino, int dias, double preco) {
        super(destino, dias, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("PACOTE ECONÔMICO");
        System.out.println("- Destino: " + destino);
        System.out.println("- Duração: " + dias + " dias");
        System.out.println("- Hospedagem simples inclusa");
        System.out.println("- Preço: R$ " + preco);
    }
}
