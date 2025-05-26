public class Participante {
    private String nome;
    private int idade;
    private String tipoIngresso;

    public Participante(String nome, int idade, String tipoIngresso) {
        this.nome = nome;
        this.idade = idade;
        this.tipoIngresso = tipoIngresso;
    }

    public void exibir() {
        System.out.println("Nome: " + nome +
                           " | Idade: " + idade +
                           " | Ingresso: " + tipoIngresso);
    }
}
