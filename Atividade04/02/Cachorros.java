public class Cachorros extends Animais{

    private String tipo;

    public Cachorros(String nome,String raca, String sexo, String tipo){
        super(nome,raca,sexo);

        this.tipo = tipo;

    }

    public void ExibirInformacoes(){

        System.out.println("CACHORRO ================");
        super.ExibirInformacoes();

        System.out.println("Tipo: " + tipo);

    }

    public void Latir(){

        System.out.println("Cachorro latindo: Au au..");
    }
    
}