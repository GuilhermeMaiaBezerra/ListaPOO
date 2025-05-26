public class Moto extends Veiculo{

    private String tipo;
    
    public Moto(String modelo, String marca, int ano, String tipo) {

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
