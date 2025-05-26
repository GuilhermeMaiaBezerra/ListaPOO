public class Main {
    public static void main(String[] args) {
        PlanoTreino basico = new PlanoBasico();
        PlanoTreino intermediario = new PlanoIntermediario();
        PlanoTreino premium = new PlanoPremium();

        System.out.println("=== PLANOS DISPONÍVEIS NA ACADEMIA POWERFIT ===\n");

        basico.exibirBeneficios();
        System.out.println();

        intermediario.exibirBeneficios();
        System.out.println();

        premium.exibirBeneficios();
    }
}
