public class Main {
    public static void main(String[] args) {

        System.out.println("\n======CARRO======\n");

        Carro meuCarro = new Carro("S10", "Chevrolet", 2020, "Carro");
        meuCarro.exibirInformacoes();
        meuCarro.LigarVeiculo();
        meuCarro.AcelerarVeiculo();

        System.out.println("\n======Moto======\n");
        Moto minhaMoto = new Moto("CG 160", "Honda", 2022, "Motocicleta");
        minhaMoto.exibirInformacoes();
        minhaMoto.LigarVeiculo();
        minhaMoto.AcelerarVeiculo();
    }
}
