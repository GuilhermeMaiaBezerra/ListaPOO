import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Item> itens;

    public Biblioteca() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
        System.out.println("Item adicionado: " + item.getTitulo());
    }

    public void emprestarItem(String codigo) {
        Item item = buscarItem(codigo);
        if (item != null) {
            item.emprestar();
        } else {
            System.out.println("Item com código " + codigo + " não encontrado.");
        }
    }

    public void devolverItem(String codigo) {
        Item item = buscarItem(codigo);
        if (item != null) {
            item.devolver();
        } else {
            System.out.println("Item com código " + codigo + " não encontrado.");
        }
    }

    public void listarItens() {
        System.out.println("\nItens da Biblioteca:");
        for (Item item : itens) {
            System.out.println(item);
        }
    }

    private Item buscarItem(String codigo) {
        for (Item item : itens) {
            if (item.getCodigo().equalsIgnoreCase(codigo)) {
                return item;
            }
        }
        return null;
    }
}
