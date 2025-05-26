import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        int opcao;
        do {
            System.out.println("\n=== MENU BANCO ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver Extrato");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Informe o valor para depósito: R$ ");
                    double valor = scanner.nextDouble();
                    if (conta.depositar(valor)) {
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor inválido!");
                    }
                }
                case 2 -> {
                    System.out.print("Informe o valor para saque: R$ ");
                    double valor = scanner.nextDouble();
                    if (conta.sacar(valor)) {
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saque inválido ou saldo insuficiente.");
                    }
                }
                case 3 -> conta.exibirExtrato();
                case 4 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
