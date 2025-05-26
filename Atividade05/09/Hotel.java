import java.time.LocalDate;

public class Hotel {
    private Reserva[] reservas;
    private int totalReservas;

    public Hotel(int capacidade) {
        reservas = new Reserva[capacidade];
        totalReservas = 0;
    }

    public boolean verificarDisponibilidade(int numeroQuarto, LocalDate entrada, LocalDate saida) {
        for (int i = 0; i < totalReservas; i++) {
            Reserva r = reservas[i];
            if (r.getNumeroQuarto() == numeroQuarto && r.conflitaCom(entrada, saida)) {
                return false;
            }
        }
        return true;
    }

    public boolean adicionarReserva(String nome, int numeroQuarto, LocalDate entrada, LocalDate saida) {
        if (!verificarDisponibilidade(numeroQuarto, entrada, saida)) {
            return false;
        }

        if (totalReservas < reservas.length) {
            reservas[totalReservas++] = new Reserva(nome, numeroQuarto, entrada, saida);
            return true;
        }

        return false;
    }

    public void listarReservas() {
        System.out.println("\n--- Reservas Atuais ---");
        if (totalReservas == 0) {
            System.out.println("Nenhuma reserva cadastrada.");
        } else {
            for (int i = 0; i < totalReservas; i++) {
                reservas[i].exibirReserva();
            }
        }
    }
}
