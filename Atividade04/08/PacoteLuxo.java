public class PacoteLuxo extends PacoteViagem {

    public PacoteLuxo(String destino, int dias, double preco) {
        super(destino, dias, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("PACOTE LUXO");
        System.out.println("- Destino: " + destino);
        System.out.println("- Duração: " + dias + " dias");
        System.out.println("- Hospedagem de luxo, passeios e traslado privativo");
        System.out.println("- Preço: R$ " + preco);
    }
}
