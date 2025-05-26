public abstract class infoPessoas { // Corrigido o nome e a estrutura

    protected String nome;
    protected String cpf;
    protected int idade;
    protected String endereco;

    public infoPessoas(String nome, String cpf, int idade, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void ExibirInformacoes() { 
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
    }
}
