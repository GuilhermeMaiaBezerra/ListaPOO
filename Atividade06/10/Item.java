public abstract class Item {
    private String codigo;
    private String titulo;
    private boolean emprestado;

    public Item(String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.emprestado = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        if (emprestado) {
            System.out.println("Item '" + titulo + "' já está emprestado.");
        } else {
            emprestado = true;
            System.out.println("Item '" + titulo + "' emprestado com sucesso.");
        }
    }

    public void devolver() {
        if (!emprestado) {
            System.out.println("Item '" + titulo + "' não está emprestado.");
        } else {
            emprestado = false;
            System.out.println("Item '" + titulo + "' devolvido com sucesso.");
        }
    }

    @Override
    public String toString() {
        return "[" + codigo + "] " + titulo + (emprestado ? " (Emprestado)" : " (Disponível)");
    }
}
