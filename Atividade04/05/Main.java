public class Main{

    public static void main(String[] args){

       Economico economico = new Economico("Celta", "Chevrolet", 10000, "Economico");
       Premium premium = new Premium("Range Rover", "JEEP", 50000, "Premium");
       SUVs suvs = new SUVs("Renegade", "JEEP", 40000, "SUV");

       economico.ExibirInformacoes();
       economico.TesteDrive();
       economico.Alugar();

       System.out.println();

       premium.ExibirInformacoes();
       premium.TesteDrive();
       premium.Alugar();

       System.out.println();

       suvs.ExibirInformacoes();
       suvs.TesteDrive();
       suvs.Alugar();

    }
}