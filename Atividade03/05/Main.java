public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lucas", 20, "123.456.789-00", "Rua A, 100", "202312345", "Engenharia");
        
        Professor professor = new Professor("Carla", 45, "987.654.321-00", "Av. Central, 50", 7500.0, "Matemática", "Exatas");

        System.out.println("=== Dados do Aluno ===");
        aluno.exibirDados();

        System.out.println("\n=== Dados do Professor ===");
        professor.exibirDados();
    }
}

