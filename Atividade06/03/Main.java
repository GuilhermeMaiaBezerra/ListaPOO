import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Calcular área e perímetro do Retângulo");
            System.out.println("2. Calcular área e perímetro do Círculo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a largura do retângulo: ");
                    double largura = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double altura = scanner.nextDouble();

                    Retangulo retangulo = new Retangulo(largura, altura);
                    System.out.println("\n" + retangulo);
                    System.out.println("Área: " + retangulo.calcularArea());
                    System.out.println("Perímetro: " + retangulo.calcularPerimetro());
                    break;

                case 2:
                    System.out.print("Digite o raio do círculo: ");
                    double raio = scanner.nextDouble();

                    Circulo circulo = new Circulo(raio);
                    System.out.println("\n" + circulo);
                    System.out.println("Área: " + circulo.calcularArea());
                    System.out.println("Perímetro: " + circulo.calcularPerimetro());
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
}
