public class Fisico extends Livro{

    private String tipo;

    public Fisico(String nome, String autor, double valor, String tipo){

        super(nome,autor,valor);

        this.tipo = tipo;
    }

    public void Exibir(){

        super.Exibir();
        System.out.println("Tipo: " +tipo);
        
    }

    public void Comprar(){

        System.out.println("Comprando livro Fisico...");
        super.Comprar();
    }
}