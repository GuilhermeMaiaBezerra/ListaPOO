public class PacienteVIP extends Paciente {

    public PacienteVIP(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
    }

    @Override
    public void Beneficios() {
        super.Beneficios();
        System.out.println("Atendimento prioritário e descontos em exames.");
    }
}
