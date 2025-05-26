public class ManipuladorTexto {
    private String texto;

    public ManipuladorTexto(String texto) {
        this.texto = texto;
    }

    public String inverter() {
        StringBuilder invertido = new StringBuilder(texto);
        return invertido.reverse().toString();
    }

    public int contarCaracteres() {
        return texto.length();
    }

    public void setTexto(String novoTexto) {
        this.texto = novoTexto;
    }

    public String getTexto() {
        return texto;
    }
}
