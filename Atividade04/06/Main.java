public class Main {

    // Método main
    public static void main(String[] args) {

        Fisico att = new Fisico("Attack on Titan", "Japones", 250.54, "Físico");
        AudioBook harry = new AudioBook("Harry Potter 1", "Varinha", 50.99, "AudioBook");
        Ebook solo = new Ebook("Solo Leveling", "Sung Jin Woo", 150.99, "E-book");

        att.Exibir();

        System.out.println();
        att.Comprar();

        System.out.println();
        harry.Exibir();
        
        System.out.println();
        harry.Comprar();

        System.out.println();
        solo.Exibir();

        System.out.println();
        solo.Comprar();
        
    }
}
