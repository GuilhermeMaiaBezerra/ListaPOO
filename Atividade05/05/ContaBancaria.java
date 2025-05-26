public class ContaBancaria {
    private double saldo;
    private String[] historico;
    private int qtdTransacoes;

    public ContaBancaria() {
        this.saldo = 0.0;
        this.historico = new String[10];
        this.qtdTransacoes = 0;
    }

    public boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }
        saldo += valor;
        registrarTransacao("Depósito de R$ " + String.format("%.2f", valor));
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            return false;
        }
        saldo -= valor;
        registrarTransacao("Saque de R$ " + String.format("%.2f", valor));
        return true;
    }

    public void exibirExtrato() {
        System.out.println("\n=== EXTRATO DA CONTA ===");
        for (int i = 0; i < qtdTransacoes; i++) {
            System.out.println(historico[i]);
        }
        System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
    }

    private void registrarTransacao(String descricao) {
        if (qtdTransacoes < historico.length) {
            historico[qtdTransacoes] = descricao;
            qtdTransacoes++;
        } else {
            System.out.println("Histórico de transações cheio!");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
