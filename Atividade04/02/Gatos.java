public class Gatos extends Animais{

    private String tipo;

    public Gatos(String nome,String raca, String sexo, String tipo){
        super(nome,raca,sexo);

        this.tipo = tipo;

    }

    public void ExibirInformacoes(){

        System.out.println("GATO ================");
        super.ExibirInformacoes();

        System.out.println("Tipo: " + tipo);

    }

    public void Miar(){

        System.out.println("Gato miando: Mial mial..");
    }
    
}