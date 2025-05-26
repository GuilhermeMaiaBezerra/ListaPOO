import java.util.Scanner;

public class Main {
    static Time time = new Time("Leões da Vila", 10);
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n=== MENU CAMPEONATO ===");
            System.out.println("1 - Adicionar jogador");
            System.out.println("2 - Remover jogador");
            System.out.println("3 - Listar jogadores");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1 -> adicionarJogador();
                case 2 -> removerJogador();
                case 3 -> time.listarJogadores();
                case 4 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
    }

    static void adicionarJogador() {
        System.out.print("Digite o nome do jogador: ");
        String nomeJogador = scanner.nextLine();
        if (time.adicionarJogador(nomeJogador)) {
            System.out.println("Jogador adicionado com sucesso!");
        } else {
            System.out.println("Não foi possível adicionar: limite de jogadores atingido.");
        }
    }

    static void removerJogador() {
        System.out.print("Digite o nome do jogador para remover: ");
        String nomeJogador = scanner.nextLine();
        if (time.removerJogador(nomeJogador)) {
            System.out.println("Jogador removido com sucesso!");
        } else {
            System.out.println("Jogador não encontrado.");
        }
    }
}
