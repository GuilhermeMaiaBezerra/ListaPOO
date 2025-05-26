public abstract class PlanoTreino {
    protected String nomePlano;
    protected double preco;

    public PlanoTreino(String nomePlano, double preco) {
        this.nomePlano = nomePlano;
        this.preco = preco;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void exibirBeneficios();
}
