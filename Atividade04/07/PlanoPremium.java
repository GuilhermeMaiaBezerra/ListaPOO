public class PlanoPremium extends PlanoTreino {

    public PlanoPremium() {
        super("Plano Premium", 249.90);
    }

    @Override
    public void exibirBeneficios() {
        System.out.println("Plano: " + nomePlano);
        System.out.println("- Acesso à musculação");
        System.out.println("- Aulas em grupo");
        System.out.println("- Acompanhamento com personal trainer");
        System.out.println("- Acesso à nutrição personalizada");
        System.out.println("Preço: R$ " + preco);
    }
}
