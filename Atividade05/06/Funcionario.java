public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void reajustarSalario(double percentual) {
        if (percentual > 0) {
            salario += salario * (percentual / 100);
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + String.format("%.2f", salario));
        System.out.println("---------------------------");
    }

    public String getNome() {
        return nome;
    }
}
