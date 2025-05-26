public class PlanoIntermediario extends PlanoTreino {

    public PlanoIntermediario() {
        super("Plano Intermediário", 149.90);
    }

    @Override
    public void exibirBeneficios() {
        System.out.println("Plano: " + nomePlano);
        System.out.println("- Acesso à musculação");
        System.out.println("- Aulas em grupo (spinning, funcional, etc)");
        System.out.println("Preço: R$ " + preco);
    }
}
