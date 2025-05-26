public class PlanoFamilia extends Plano {
    private int usuarios;

    public PlanoFamilia(int usuarios) {
        super("Plano Família", 39.90);
        this.usuarios = usuarios;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== " + nome + " ===");
        System.out.println("- Preço: R$ " + preco);
        System.out.println("- Até " + usuarios + " usuários simultâneos");
        System.out.println("- Qualidade HD");
    }
}
