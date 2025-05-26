public class Livro extends Item {
    private String autor;

    public Livro(String codigo, String titulo, String autor) {
        super(codigo, titulo);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro: " + super.toString() + " - Autor: " + autor;
    }
}
