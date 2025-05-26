import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Hotel hotel = new Hotel(10);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n=== MENU HOTEL ===");
            System.out.println("1 - Fazer reserva");
            System.out.println("2 - Verificar disponibilidade");
            System.out.println("3 - Listar reservas");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa buffer

            switch (opcao) {
                case 1 -> fazerReserva();
                case 2 -> verificarDisponibilidade();
                case 3 -> hotel.listarReservas();
                case 4 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }

    static void fazerReserva() {
        System.out.print("Nome do hóspede: ");
        String nome = scanner.nextLine();

        System.out.print("Número do quarto: ");
        int numero = scanner.nextInt();

        System.out.print("Data de entrada (AAAA-MM-DD): ");
        LocalDate entrada = LocalDate.parse(scanner.next());

        System.out.print("Data de saída (AAAA-MM-DD): ");
        LocalDate saida = LocalDate.parse(scanner.next());

        if (entrada.isAfter(saida)) {
            System.out.println("Data de entrada não pode ser depois da saída!");
            return;
        }

        boolean sucesso = hotel.adicionarReserva(nome, numero, entrada, saida);
        if (sucesso) {
            System.out.println("Reserva realizada com sucesso!");
        } else {
            System.out.println("Quarto indisponível ou hotel lotado.");
        }
    }

    static void verificarDisponibilidade() {
        System.out.print("Número do quarto: ");
        int numero = scanner.nextInt();

        System.out.print("Data de entrada (AAAA-MM-DD): ");
        LocalDate entrada = LocalDate.parse(scanner.next());

        System.out.print("Data de saída (AAAA-MM-DD): ");
        LocalDate saida = LocalDate.parse(scanner.next());

        boolean disponivel = hotel.verificarDisponibilidade(numero, entrada, saida);
        if (disponivel) {
            System.out.println("Quarto disponível para reserva!");
        } else {
            System.out.println("Quarto indisponível para o período informado.");
        }
    }
}
