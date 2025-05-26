public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Wanderson", "123.456.789-39", 32,
        "Rua Rio Pacia", "Estrutura de Dados II", "Professor", 3400.0f);

        prof.ExibirInformacoes(); 

        System.out.println("");
        Aluno aln = new Aluno("Guilherme Maia Bezerra", "704.999.682-39", 23,
        "Rua Rio Pacia", "4504", "Sistema de Informacao");

        aln.ExibirInformacoes();
    }
}
