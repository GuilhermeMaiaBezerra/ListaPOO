import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    static ArrayList<Aluno> alunos = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int opcao = 0;
       do{
        
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Lançar Notas");
        System.out.println("3 - Ver notas");
        System.out.println("4 - Sair");
        System.out.print("Digite o código: ");
        opcao = scanner.nextInt();

        scanner.nextLine(); // Limpar Buffer

        switch (opcao) {
            case 1 -> CadastrarAluno();
            case 2 -> LancarNotas();
            case 3 -> mostrarDados();
            case 4 -> System.out.println("\nSaindo do programa...\n");
            default -> System.out.println("\nCódigo incorreto\n");
        }

       }while(opcao != 4);
        
    }

     
     static void CadastrarAluno(){

        String nome,disciplina,matricula;

            System.out.println("\n---CADASTRO ALUNOS---\n");

            System.out.print("Matrícula: ");
            matricula = scanner.nextLine();

            System.out.print("Nome: ");
            nome = scanner.nextLine();

            System.out.print("Disciplina: ");
            disciplina = scanner.nextLine();

         if(nome != "" && disciplina != "" && matricula != ""){
            System.out.println("Cadastro realizado com sucesso!");
            alunos.add(new Aluno(nome,disciplina,matricula));
         } 
         else{
            System.out.println("\n(Mensagem do Sistema) - Erro no cadastro! Informe os dados do aluno!");
         }
     }


    static void LancarNotas() {

        System.out.println("\n---LANÇAR NOTAS ALUNO---\n");

        System.out.print("Informe a matrícula do aluno: ");
        String matricula = scanner.nextLine();
        Aluno aluno = buscarAluno(matricula);

        if (aluno != null) {

            while (true) { // Verificação N1=====
                System.out.print("Nota N1: ");
                if (scanner.hasNextDouble()) {
                    double n1 = scanner.nextDouble();
                    if (n1 >= 0 && n1 <= 10) {
                        aluno.nota1 = n1;
                        break;
                    } else {
                        System.out.println("A nota deve estar entre 0 e 10.");
                        scanner.nextLine();
                    }
                } else {
                    System.out.println("Formato incorreto");
                    scanner.nextLine(); // Limpa o buffer
                }

            }

            scanner.nextLine();

            while (true) { // Verificação N2=====
                System.out.print("Nota N2: ");
                if (scanner.hasNextDouble()) {
                    double n2 = scanner.nextDouble();
                    if (n2 >= 0 && n2 <= 10) {
                        aluno.nota2 = n2;
                        break;
                    } else {
                        System.out.println("A nota deve estar entre 0 e 10.");
                        scanner.nextLine();
                    }
                } else {
                    System.out.println("\nFormato incorreto");
                    scanner.nextLine(); // Limpa o buffer
                }
            }

            aluno.calcularMedia();
            System.out.println("\nNotas lançadas e média calculada!\n");

        } else {
            System.out.println("\nAluno não foi encontrado.\n");
        }
    }

    static Aluno buscarAluno(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.matricula.equalsIgnoreCase(matricula)) {
                return aluno;
            }
        }
        return null;
    }

     static void mostrarDados() {
        if (alunos.isEmpty()) {
            System.out.println("\n\nNenhum aluno cadastrado.");
            return;
        }
        for (Aluno aluno : alunos) {

                 aluno.ExibirDados();
        }
    }
}