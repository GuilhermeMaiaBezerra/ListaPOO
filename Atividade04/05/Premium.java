public class Premium extends Veiculo{

    private String classe;

    public Premium(String modelo, String marca, float valor, String classe){

        super(modelo,marca,valor);

        this.classe = classe;

    }


    public void ExibirInformacoes(){

        super.ExibirInformacoes(); //Herança && Polimofismo
        System.out.println("\nBeneficios =============");
        System.out.println("Classe: " + classe);
        System.out.println("Tanque cheio");
        System.out.println("Motorista Particular");
        System.out.println("Wifi");
        System.out.println("Seguro de roubo/acidente");

    }

    public void TesteDrive(){

        super.TesteDrive(); //Herança
        System.out.println("Valor Teste: R$ 500,00"); // Polimofismo
    }

    public void Alugar(){

        super.Alugar();
        System.out.println("Valor: R$ " + valor);
    }
}