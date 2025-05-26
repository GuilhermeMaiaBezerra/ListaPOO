public class PacoteTuristico extends PacoteViagem {

    public PacoteTuristico(String destino, int dias, double preco) {
        super(destino, dias, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("PACOTE TURÍSTICO");
        System.out.println("- Destino: " + destino);
        System.out.println("- Duração: " + dias + " dias");
        System.out.println("- Hospedagem + passeios inclusos");
        System.out.println("- Preço: R$ " + preco);
    }
}
