import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Usuario usuario = new Usuario("admin", "12345");
        Autenticador autenticador = new Autenticador();

        autenticador.solicitarAutenticacao();

        System.out.print("Digite a senha para o usuário '" + usuario.getNome() + "': ");
        String senhaDigitada = scanner.nextLine();

        if (autenticador.autenticarUsuario(usuario, senhaDigitada)) {
            System.out.println("Autenticação bem-sucedida! Bem-vindo, " + usuario.getNome() + "!");
        } else {
            System.out.println("Senha incorreta. Acesso negado.");
        }

        scanner.close();
    }
}
