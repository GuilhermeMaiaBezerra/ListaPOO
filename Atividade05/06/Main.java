import java.util.Scanner;

public class Main {
    static Funcionario[] funcionarios = new Funcionario[100];
    static int totalFuncionarios = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU FUNCIONÁRIOS ===");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Reajustar salário");
            System.out.println("3 - Listar funcionários");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> cadastrarFuncionario(scanner);
                case 2 -> reajustarSalario(scanner);
                case 3 -> listarFuncionarios();
                case 4 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        scanner.close();
    }

    static void cadastrarFuncionario(Scanner scanner) {
        if (totalFuncionarios >= funcionarios.length) {
            System.out.println("Limite de funcionários atingido.");
            return;
        }

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Salário: R$ ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        funcionarios[totalFuncionarios] = new Funcionario(nome, cargo, salario);
        totalFuncionarios++;

        System.out.println("Funcionário cadastrado com sucesso!");
    }

    static void reajustarSalario(Scanner scanner) {
        System.out.print("Digite o nome do funcionário: ");
        String nomeBusca = scanner.nextLine();

        Funcionario funcionario = buscarFuncionarioPorNome(nomeBusca);

        if (funcionario != null) {
            System.out.print("Percentual de reajuste (%): ");
            double percentual = scanner.nextDouble();
            scanner.nextLine();
            funcionario.reajustarSalario(percentual);
            System.out.println("Salário reajustado com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    static void listarFuncionarios() {
        if (totalFuncionarios == 0) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        System.out.println("\n=== LISTA DE FUNCIONÁRIOS ===");
        for (int i = 0; i < totalFuncionarios; i++) {
            funcionarios[i].exibirDados();
        }
    }

    static Funcionario buscarFuncionarioPorNome(String nome) {
        for (int i = 0; i < totalFuncionarios; i++) {
            if (funcionarios[i].getNome().equalsIgnoreCase(nome)) {
                return funcionarios[i];
            }
        }
        return null;
    }
}
