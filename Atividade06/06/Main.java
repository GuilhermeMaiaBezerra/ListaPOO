import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Vaca());

        System.out.println("Sons dos animais:");
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
