public class Economico extends Veiculo{

    //Encapsolamento

    private String classe;

    public Economico(String modelo, String marca, float valor, String classe){

        super(modelo,marca,valor);
        
        this.classe = classe;

    }

    @Override
    public void ExibirInformacoes(){

        super.ExibirInformacoes(); //Herança && Polimofismo
        System.out.println("\nBeneficios =============");
        System.out.println("Classe: " + classe);
        System.out.println("Limite de 200Km dia");
        System.out.println("Tanque cheio");
        System.out.println("GPS Inteligente");

    }

    public void TesteDrive(){

        super.TesteDrive(); //Herança
        System.out.println("Valor Teste: R$ 100,00"); // Polimofismo
    }

    public void Alugar(){

        super.Alugar();
        System.out.println("Valor: R$" + valor);
    }
}