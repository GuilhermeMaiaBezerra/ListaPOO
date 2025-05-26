public class Poupanca extends Banco {

    private String tipoConta;

    public Poupanca(String nomeBanco,int agencia, String numeroConta, String nomeUser, int idade, String tipoConta){

        super(nomeBanco, agencia, numeroConta, nomeUser, idade);

        this.tipoConta = tipoConta;
    }

    @Override
    public void ExbirInformacoes(){
        super.ExbirInformacoes();
        System.out.println("Tipo Conta: "+ tipoConta);
    }
    
    
}
