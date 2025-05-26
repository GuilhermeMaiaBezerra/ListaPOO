abstract class Banco{

    protected String nomeBanco;
    protected int agencia;
    protected String numeroConta;
    protected String nomeUser;
    protected int idade;

    public Banco(String nomeBanco,int agencia, String numeroConta, String nomeUser, int idade){

        this.nomeBanco = nomeBanco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.nomeUser = nomeUser;
        this.idade = idade;

    }

    public void ExbirInformacoes(){

        System.out.println("Banco: "+ nomeBanco);
        System.out.println("Agencia: "+ agencia);
        System.out.println("Conta: "+ numeroConta);
        System.out.println("Nome: "+ nomeUser);
        System.out.println("Idade: "+ idade);
    }
}
