public class Time {
    
    private String nome;
    private String[] jogadores;
    private int totalJogadores;

    public Time(String nome, int capacidadeJogadores) {
        this.nome = nome;
        this.jogadores = new String[capacidadeJogadores];
        this.totalJogadores = 0;
    }

    public String getNome() {
        return nome;
    }

    public boolean adicionarJogador(String jogador) {
        if (totalJogadores < jogadores.length) {
            jogadores[totalJogadores] = jogador;
            totalJogadores++;
            return true;
        } else {
            return false;
        }
    }

    public boolean removerJogador(String nomeJogador) {
        for (int i = 0; i < totalJogadores; i++) {
            if (jogadores[i].equalsIgnoreCase(nomeJogador)) {
                for (int j = i; j < totalJogadores - 1; j++) {
                    jogadores[j] = jogadores[j + 1];
                }
                jogadores[totalJogadores - 1] = null;
                totalJogadores--;
                return true;
            }
        }
        return false;
    }

    public void listarJogadores() {
        System.out.println("Time: " + nome);
        if (totalJogadores == 0) {
            System.out.println("Nenhum jogador cadastrado.");
        } else {
            for (int i = 0; i < totalJogadores; i++) {
                System.out.println("- " + jogadores[i]);
            }
        }
    }
}
