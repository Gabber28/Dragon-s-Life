public class Personagem{
    private String nome;
    private int vida;
    private int forca;

    public Personagem(String nome, int vida, int forca){
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public String getNome{
        return nome;
    }

    public String setNome{
        this.nome = nome;
    }

    public int getVida{
        return vida;
    }

    public int setVida{
        this.vida = vida;
    }

    public int getForca{
        return vida;
    }

    public int setVida{
        this.vida = vida;
    }

    public void exibirInfo{
        System.out.print("O nome do seu personagem é: " + nome);
        System.out.print("Ele tem " + vida + " de vida");
        System.out.print("Ele tem " forca + " de força");
    }
}