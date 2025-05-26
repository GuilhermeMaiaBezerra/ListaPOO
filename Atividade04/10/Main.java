public class Main {
    public static void main(String[] args) {
        Plano basico = new PlanoBasico();
        Plano familia = new PlanoFamilia(4);
        Plano premium = new PlanoPremium(true);

        System.out.println("Planos disponíveis na CinePlus:\n");

        basico.exibirDetalhes();
        System.out.println();

        familia.exibirDetalhes();
        System.out.println();

        premium.exibirDetalhes();
    }
}
