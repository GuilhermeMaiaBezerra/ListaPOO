public class Smartwatche extends Produto{

    private int armazenamento;

    public Smartwatche(String nomeProduto, String marca, double valor, int armazenamento){

        super(nomeProduto, marca, valor);

        this.armazenamento = armazenamento;
    }

    public void ExibirInformacoes(){

        System.out.println("SMARTWATCHE ==================");
        super.ExibirInformacoes();
        System.out.println("Armazenamento: " + armazenamento + " GB");

    }

    public void Notificacoes(){
        System.out.println("Vendo notificações...");
    }

}