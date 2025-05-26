public class Ebook extends Livro{

    private String tipo;

    public Ebook(String nome, String autor, double valor, String tipo){

        super(nome,autor,valor);

        this.tipo = tipo;
    }

    public void Exibir(){

        super.Exibir();
        System.out.println("Tipo: " +tipo);
        
    }

    public void Comprar(){

        System.out.println("Comprando livro EBook...");
        super.Comprar();
    }
}