public class Professor extends infoPessoas { 

    private String disciplina;
    private String areaAtuacao;
    private float salario;

    public Professor(String nome, String cpf, int idade, String endereco, String disciplina, String areaAtuacao, float salario) {
        super(nome, cpf, idade, endereco);
        this.disciplina = disciplina;
        this.areaAtuacao = areaAtuacao;
        this.salario = salario;
    }

    @Override
    public void ExibirInformacoes() {
        super.ExibirInformacoes();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Area de Atuacao: " + areaAtuacao);
        System.out.println("Salario: " + salario);
    }
}
