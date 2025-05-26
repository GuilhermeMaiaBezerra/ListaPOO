public class PacienteConvenio extends Paciente {
    private String nomeConvenio;

    public PacienteConvenio(String nome, int idade, String cpf, String nomeConvenio) {
        super(nome, idade, cpf);
        this.nomeConvenio = nomeConvenio;
    }

    @Override
    public void Beneficios() {
        super.Beneficios();
        System.out.println("Consulta coberta pelo convênio: " + nomeConvenio);
    }
}
