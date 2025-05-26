import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Evento evento = new Evento(100);
        int opcao;

        do {
            System.out.println("\n=== MENU DO EVENTO ===");
            System.out.println("1 - Cadastrar participante");
            System.out.println("2 - Listar participantes");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Tipo de ingresso (VIP/Normal/Estudante): ");
                    String ingresso = scanner.nextLine();

                    boolean sucesso = evento.adicionarParticipante(nome, idade, ingresso);
                    if (sucesso) {
                        System.out.println("Participante cadastrado com sucesso!");
                    } else {
                        System.out.println("Evento cheio. Não é possível adicionar mais participantes.");
                    }
                }
                case 2 -> evento.listarParticipantes();
                case 3 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        scanner.close();
    }
}
