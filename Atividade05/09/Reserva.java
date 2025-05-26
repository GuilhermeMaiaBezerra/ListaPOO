import java.time.LocalDate;

public class Reserva {
    private String nomeHospede;
    private int numeroQuarto;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;

    public Reserva(String nomeHospede, int numeroQuarto, LocalDate dataEntrada, LocalDate dataSaida) {
        this.nomeHospede = nomeHospede;
        this.numeroQuarto = numeroQuarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void exibirReserva() {
        System.out.println("Hóspede: " + nomeHospede +
            " | Quarto: " + numeroQuarto +
            " | Entrada: " + dataEntrada +
            " | Saída: " + dataSaida);
    }

    public boolean conflitaCom(LocalDate entrada, LocalDate saida) {
        return !(saida.isBefore(this.dataEntrada) || entrada.isAfter(this.dataSaida));
    }
}
