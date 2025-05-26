public class Passaros extends Animais{

    private String tipo;

    public Passaros(String nome,String raca, String sexo, String tipo){
        super(nome,raca,sexo);

        this.tipo = tipo;

    }

    public void ExibirInformacoes(){

        System.out.println("PASSÁRO ================");
        super.ExibirInformacoes();

        System.out.println("Tipo: " + tipo);

    }

    public void Canto(){

        System.out.println("Passáro cantando: Canto...");
    }
    
}