public class Professor extends Pessoa {
    private double salario;
    private String disciplina;
    private String areaAtuacao;

    public Professor(String nome, int idade, String cpf, String endereco, double salario, String disciplina, String areaAtuacao) {
        super(nome, idade, cpf, endereco);
        this.salario = salario;
        this.disciplina = disciplina;
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Salário: R$" + salario);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Área de Atuação: " + areaAtuacao);
    }
}
