public abstract class Veiculo{

    //Encapsolamento=============
    protected String modelo;
    protected String marca;
    protected float valor;

    //Construtor
    public Veiculo(String modelo, String marca, float valor){ 

        //Atributos
        this.modelo = modelo; 
        this.marca = marca;
        this.valor = valor;

    }

    //Metodos================================
    public void ExibirInformacoes(){

        System.out.println("\nModelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Valor: " + valor);

    }

    public void TesteDrive(){

        System.out.println("\nIniciando teste drive com veiculo " + modelo);

    }

    public void Alugar(){

        System.out.println("\n"+ modelo + " foi alugado");
    }


}