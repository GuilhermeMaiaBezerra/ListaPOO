public class Evento {
    private Participante[] participantes;
    private int totalParticipantes;

    public Evento(int capacidade) {
        participantes = new Participante[capacidade];
        totalParticipantes = 0;
    }

    public boolean adicionarParticipante(String nome, int idade, String tipoIngresso) {
        if (totalParticipantes < participantes.length) {
            participantes[totalParticipantes++] = new Participante(nome, idade, tipoIngresso);
            return true;
        }
        return false; // Evento cheio
    }

    public void listarParticipantes() {
        System.out.println("\n--- Lista de Participantes ---");
        if (totalParticipantes == 0) {
            System.out.println("Nenhum participante registrado.");
        } else {
            for (int i = 0; i < totalParticipantes; i++) {
                participantes[i].exibir();
            }
        }
    }
}
