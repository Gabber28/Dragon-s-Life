// Mago.java
public class Mago extends Personagem {
    // Atributo específico do Mago
    private int mana;

    // Construtor
    public Mago(String nome, int vida, int forca, int mana) {
        super(nome, vida, forca);
        this.mana = mana;
    }

    // Getter e Setter para o atributo mana
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    // Sobrescrevendo o método exibirInfo para incluir a mana
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Mana: " + mana);
    }
}