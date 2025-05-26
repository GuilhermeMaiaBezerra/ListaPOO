public abstract class Animais{

    protected String nome;
    protected String raca;
    protected String sexo;
    
    public Animais(String nome, String raca, String sexo){

        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
    }

    public void ExibirInformacoes(){

        System.out.println("Nome: " + nome);
        System.out.println("Raca: " + raca);
        System.out.println("Sexo: " + sexo);
    }

}