public class PacienteComum extends Paciente {

    public PacienteComum(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }

    @Override
    public void Beneficios() {
        super.Beneficios();
        System.out.println("Sem benefícios especiais.");
    }
}
