public class Smartphone extends Produto{

    private int armazenamento;

    public Smartphone(String nomeProduto, String marca, double valor, int armazenamento){

        super(nomeProduto, marca, valor);

        this.armazenamento = armazenamento;
    }

    public void ExibirInformacoes(){

        System.out.println("SMARTHPHONE ==================");
        super.ExibirInformacoes();
        System.out.println("Armazenamento: " + armazenamento + " GB");

    }

    public void FazerChamada(){
        System.out.println("Fazendo ligacao...");
    }

}