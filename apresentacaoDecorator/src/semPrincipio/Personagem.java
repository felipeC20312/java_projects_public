package semPrincipio;

public class Personagem {
    String nome;
    int vida;
    public String arma;

    public Personagem(String nome, int vida, String arma) {
        this.nome = nome;
        this.vida = vida;
        this.arma = arma;
    }

    public void atacar() {
        System.out.println(nome + " atacou com " + arma + "!");
    }

    public void receberDano(int quantidade) {
        vida -= quantidade;
        System.out.println(nome + " recebeu " + quantidade + " de dano. Vida restante: " + vida);
    }
}
