import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String textoUsuario = scanner.nextLine();

        ManipuladorTexto manipulador = new ManipuladorTexto(textoUsuario);

        System.out.println("Texto original: " + manipulador.getTexto());
        System.out.println("Texto invertido: " + manipulador.inverter());
        System.out.println("Quantidade de caracteres: " + manipulador.contarCaracteres());

        scanner.close();
    }
}
