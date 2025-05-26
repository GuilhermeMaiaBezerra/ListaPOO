public class ConexaoBanco {
    private static ConexaoBanco instanciaUnica;

    private ConexaoBanco() {
        System.out.println("Nova conexão criada!");
    }

    public static ConexaoBanco getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new ConexaoBanco();
        }
        return instanciaUnica;
    }

    public void executarConsulta(String sql) {
        System.out.println("Executando consulta: " + sql);
    }
}
