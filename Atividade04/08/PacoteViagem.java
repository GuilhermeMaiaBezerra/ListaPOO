public abstract class PacoteViagem {
    protected String destino;
    protected int dias;
    protected double preco;

    public PacoteViagem(String destino, int dias, double preco) {
        this.destino = destino;
        this.dias = dias;
        this.preco = preco;
    }

    public String getDestino() {
        return destino;
    }

    public int getDias() {
        return dias;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void exibirDetalhes();
}
