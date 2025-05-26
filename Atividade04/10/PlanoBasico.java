public class PlanoBasico extends Plano {

    public PlanoBasico() {
        super("Plano Básico", 19.90);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== " + nome + " ===");
        System.out.println("- Preço: R$ " + preco);
        System.out.println("- Qualidade padrão (SD)");
        System.out.println("- 1 usuário por vez");
    }
}
