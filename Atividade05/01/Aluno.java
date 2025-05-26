    public class Aluno{

         String nome;
         String disciplina;
         String matricula;
         double nota1;
         double nota2;
         double media;
         String status;

        public Aluno(String nome, String disciplina, String matricula){

            this.nome = nome;
            this.disciplina = disciplina;
            this.matricula = matricula;
            this.nota1 = 0;
            this.nota2 = 0;
            this.media = 0;
            this.status = "Sem nota lançada";

        }

        public void calcularMedia() {
        this.media = (nota1 + nota2) / 2;
        if (media >= 6) {
            status = "APROVADO(A)";
        } else {
            status = "REPROVADO(A)";
        }

    }

        public void ExibirDados(){

            System.out.println("--- Dados do Aluno ---");
            System.out.println("Matrícula: " + matricula);
            System.out.println("Nome: " + nome);
            System.out.println("Disciplina: " + disciplina);
            System.out.println("Nota 1: " + nota1);
            System.out.println("Nota 2: " + nota2);
            System.out.println("Média: " + media);
            System.out.println("Status: " + status);
            System.out.println("---------//------------\n");


        }
    }