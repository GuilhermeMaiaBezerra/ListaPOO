/* 1.	Você foi contratado pela Loja Virtual "TechGadgets" para desenvolver
 um sistema de produtos eletrônicos. A loja vende smartphones, notebooks e smartwatches
  (que possuem funcionalidades exclusivas). Implemente os conceitos de classes, objetos, abstração,
   encapsulamento, herança e polimorfismo para construir esse sistema em Java.*/

public class main{
    public static void main(String[] args){
        
        Smartphone celular = new Smartphone("Galaxy A10", "Samsung", 1000, 128);
        Notebook notebook = new Notebook("Acer Nitro V15", "Acer", 5998.99, "Intel Core i7-13620H");

        Smartwatche smartWatche = new Smartwatche("XH2 Ultra", "Evo Tiger", 250.00, 15);
        celular.ExibirInformacoes();
        celular.FazerChamada();

        System.out.println();

        notebook.ExibirInformacoes();
        notebook.Programar();

        System.out.println();

        smartWatche.ExibirInformacoes();
        smartWatche.Notificacoes();
    }
}