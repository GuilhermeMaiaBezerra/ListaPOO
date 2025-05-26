public class Main {
    public static void main(String[] args) {

        PacoteViagem economico = new PacoteEconomico("Fortaleza", 5, 899.90);
        PacoteViagem turistico = new PacoteTuristico("Rio de Janeiro", 7, 1899.90);
        PacoteViagem luxo = new PacoteLuxo("Fernando de Noronha", 6, 5499.90);

        System.out.println("=== PACOTES DISPONÍVEIS - MUNDOABERTO ===\n");

        economico.exibirDetalhes();
        System.out.println();

        turistico.exibirDetalhes();
        System.out.println();

        luxo.exibirDetalhes();
    }
}
