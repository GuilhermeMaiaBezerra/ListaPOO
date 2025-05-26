public class Aluno extends infoPessoas{

    private String matricula;
    private String curso;

    public Aluno(String nome, String cpf, int idade, String endereco, String matricula,String curso){
        super(nome, cpf, idade, endereco);

        this.matricula = matricula;
        this.curso = curso;

    }

    public void ExibirInformacoes(){
        super.ExibirInformacoes();
        System.out.println("Matricula: "+ matricula);
        System.out.println("Curso: "+ curso);
    }
    
}
