public class Main{
    public static void Main (String[] args) {
        Guerreiro guerreirinho = new Guerreiro ("Valdir", 100000000, 282828282828, "Espada Longa");
        System.out.println("Informações do Valdir:");
        guerreirinho.exibirInfo();

        System.out.println();

        Mago magoceta = new Mago ("Halastor", 28, 28365254, 50000000);
        System.out.println("Informações do Halastor:");
        magoceta.exibirInfo();
        
    }
}