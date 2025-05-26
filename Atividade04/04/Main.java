public class Main {
    public static void main(String[] args) {
        Paciente comum = new PacienteComum("João Silva", 30, "123.456.789-00");
        Paciente vip = new PacienteVIP("Maria Souza", 28, "987.654.321-00");
        Paciente convenio = new PacienteConvenio("Carlos Lima", 45, "456.789.123-00", "Unimed");

        comum.exibirDados();
        comum.Beneficios();

        System.out.println();

        vip.exibirDados();
        vip.Beneficios();

        System.out.println();

        convenio.exibirDados();
        convenio.Beneficios();
    }
}
