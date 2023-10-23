package semprincipioPrototype;

public class Inimigo {
    private String nome;
    private int vida;
    private int damage;

    public Inimigo(String nome, int vida, int damage) {
        this.nome = nome;
        this.vida = vida;
        this.damage = damage;
    }

    public void batalha() {
        System.out.println(nome + " ataca causando " + damage + " de dano.");
    }

    // Getters and setters...
}

