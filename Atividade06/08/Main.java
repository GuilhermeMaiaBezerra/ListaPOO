public class Main {
    public static void main(String[] args) {
        ConexaoBanco conexao1 = ConexaoBanco.getInstancia();
        conexao1.executarConsulta("SELECT * FROM tabela");

        ConexaoBanco conexao2 = ConexaoBanco.getInstancia();
        conexao2.executarConsulta("UPDATE tabela SET coluna = 'valor'");

        System.out.println("Mesma instância? " + (conexao1 == conexao2));
    }
}
