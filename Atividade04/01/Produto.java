public abstract class Produto{

    protected String nomeProduto;
    protected String marca;
    protected double valor;

    public Produto(String nomeProduto, String marca, double valor){

        this.nomeProduto = nomeProduto;
        this.marca = marca;
        this.valor = valor;
    }

    public void ExibirInformacoes(){
        
        System.out.println("Produto: "+ nomeProduto);
        System.out.println("Marca: "+ marca);
        System.out.println("Valor: R$ "+ valor);
    }
}