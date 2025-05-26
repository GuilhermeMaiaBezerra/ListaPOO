public class Contador {
    private static int totalObjetos = 0; // Contador compartilhado por todos os objetos

    public Contador() {
        totalObjetos++; // Incrementa ao criar um novo objeto
    }

    // Método estático para acessar o total atual
    public static int getTotalObjetos() {
        return totalObjetos;
    }
}
