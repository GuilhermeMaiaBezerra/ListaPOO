public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        Operacao soma = new Soma();
        Operacao divisao = new Divisao();

        double resultadoSoma = calc.executarOperacao(soma, 10, 5);
        System.out.println("Soma: " + resultadoSoma);

        try {
            double resultadoDivisao = calc.executarOperacao(divisao, 10, 0);
            System.out.println("Divisão: " + resultadoDivisao);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
