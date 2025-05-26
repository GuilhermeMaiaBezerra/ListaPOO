public class PlanoBasico extends PlanoTreino {

    public PlanoBasico() {
        super("Plano Básico", 99.90);
    }

    @Override
    public void exibirBeneficios() {
        System.out.println("Plano: " + nomePlano);
        System.out.println("- Acesso à musculação");
        System.out.println("Preço: R$ " + preco);
    }
}
