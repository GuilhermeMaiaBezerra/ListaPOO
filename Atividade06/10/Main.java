public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("L001", "Dom Casmurro", "Machado de Assis");
        Revista revista1 = new Revista("R001", "Superinteressante", 100);

        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(revista1);

        biblioteca.listarItens();

        biblioteca.emprestarItem("L001");
        biblioteca.emprestarItem("R001");

        biblioteca.listarItens();

        biblioteca.devolverItem("L001");
        biblioteca.devolverItem("R002");

        biblioteca.listarItens();
    }
}
