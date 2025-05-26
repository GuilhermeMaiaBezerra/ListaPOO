public class Notebook extends Produto{

    private String processador;

    public Notebook(String nomeProduto, String marca, Double valor, String processador){

        super(nomeProduto, marca, valor);

        this.processador = processador;
    }

    public void ExibirInformacoes(){

        System.out.println("NOTEBOOK ==================");
        super.ExibirInformacoes();

        System.out.println("Processador: " + processador);
    }

    public void Programar(){
        System.out.println("Programando no notebook...");
    }
    
}
