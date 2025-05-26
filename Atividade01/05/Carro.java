public class Carro extends Veiculo{

    private String tipo;
    
    public Carro(String modelo, String marca, int ano, String tipo) {

        super(modelo, marca, ano);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("tipo: " + tipo);
    }
}
