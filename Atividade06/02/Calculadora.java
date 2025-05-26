import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Somar dois números");
            System.out.println("2. Calcular a área de um círculo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    somarNumeros(scanner);
                    break;
                case 2:
                    calcularAreaCirculo(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void somarNumeros(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = num1 + num2;
        System.out.println("A soma é: " + resultado);
    }

    public static void calcularAreaCirculo(Scanner scanner) {
        final double PI = 3.14159;

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = PI * raio * raio;
        System.out.println("A área do círculo é: " + area);
    }
}
