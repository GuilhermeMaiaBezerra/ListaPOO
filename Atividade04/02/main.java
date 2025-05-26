/* 2.	Você foi contratado pela "PetShop Feliz" para criar um sistema
 de gerenciamento de animais. O petshop trabalha com cães, gatos e pássaros 
 (que possuem características e serviços específicos). Implemente os conceitos de POO
  (classes, objetos, abstração, encapsulamento, herança e polimorfismo) para modelar esse sistema em Java.*/

public class main{
    public static void main(String[] args){

        Cachorros cachorro = new Cachorros("Zoe", "R.S.D", "Fêmea","Cão");
        Gatos gato = new Gatos("Gertrudes", "Siamês", "Fêmea","Gato");
        Passaros passaro = new Passaros("Blue", "Arara", "Macho","Passáro");

        cachorro.ExibirInformacoes();
        cachorro.Latir();

        System.out.println();

        gato.ExibirInformacoes();
        gato.Miar();

        System.out.println();

        passaro.ExibirInformacoes();
        passaro.Canto();

    }
}