public class Main {
    public static void main(String[] args) {

        Poupanca infoPoupanca = new Poupanca("Bradesco", 31,  "33388899922",
        "Guilherme Maia Bezerra", 23, "Poupança");

        infoPoupanca.ExbirInformacoes();

        System.out.println("");

        Corrente infoCorrente = new Corrente("Itau", 31,  "444999922282",
        "Wanderson", 23, "Corrente");

        infoCorrente.ExbirInformacoes();

    }
    
}
