public abstract class Veiculo {

    protected String modelo;
    protected String marca;
    protected int ano;
    
    public Veiculo(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano + " anos");
    }

    public void LigarVeiculo() {
        System.out.println("Ligando... " + modelo);
    }
     public void AcelerarVeiculo() {
        System.out.println("Acelerando... " + modelo);
    }
}
