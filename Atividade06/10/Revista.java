public class Revista extends Item {
    private int numeroEdicao;

    public Revista(String codigo, String titulo, int numeroEdicao) {
        super(codigo, titulo);
        this.numeroEdicao = numeroEdicao;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    @Override
    public String toString() {
        return "Revista: " + super.toString() + " - Edição: " + numeroEdicao;
    }
}
