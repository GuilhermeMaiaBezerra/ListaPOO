public class PlanoPremium extends Plano {
    private boolean acessoAntecipado;

    public PlanoPremium(boolean acessoAntecipado) {
        super("Plano Premium", 59.90);
        this.acessoAntecipado = acessoAntecipado;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== " + nome + " ===");
        System.out.println("- Preço: R$ " + preco);
        System.out.println("- Qualidade 4K Ultra HD");
        System.out.println("- Acesso antecipado: " + (acessoAntecipado ? "Sim" : "Não"));
    }
}
