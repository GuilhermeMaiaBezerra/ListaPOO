public class Autenticador {
    public void solicitarAutenticacao() {
        System.out.println("Acesso restrito! Por favor, autentique-se com sua senha.");
    }

    public boolean autenticarUsuario(Usuario usuario, String senhaInformada) {
        return usuario.autenticar(senhaInformada);
    }
}
