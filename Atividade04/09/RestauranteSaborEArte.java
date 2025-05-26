public class RestauranteSaborEArte {
    public static void main(String[] args) {
        ItemCardapio prato = new PratoALaCarte("Filé Mignon ao Molho Madeira", 48.90, "Servido com arroz e batatas rústicas.");
        ItemCardapio combo = new ComboPromocional("Combo Família", 89.90, "2 Pratos principais + 2 Refrigerantes + 1 Sobremesa", 20);
        ItemCardapio degustacao = new MenuDegustacao("Menu Chef Especial", 149.90, 7);

        System.out.println("=== CARDÁPIO DIGITAL - SABOR & ARTE ===\n");

        prato.exibirDetalhes();
        System.out.println();

        combo.exibirDetalhes();
        System.out.println();

        degustacao.exibirDetalhes();
    }
}
