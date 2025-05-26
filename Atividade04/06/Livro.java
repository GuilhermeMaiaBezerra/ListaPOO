public abstract class Livro{

    protected String nome;
    protected String autor;
    protected double valor;

    public Livro(String nome, String autor, double valor){

        this.nome = nome;
        this.autor = autor;
        this.valor = valor;
    }

    public void Exibir(){

        System.out.println("Nome: " +nome);
        System.out.println("Autor: " + autor);
        System.out.println("Valor: " + valor);
    }

    public void Comprar(){
        System.out.println("Comprou...");
    }
}