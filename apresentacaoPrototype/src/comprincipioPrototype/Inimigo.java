package comprincipioPrototype;

public class Inimigo implements Cloneable {
    private String nome;
    private int vida;
    private int damage;

    public Inimigo(String nome, int vida, int damage) {
        this.nome = nome;
        this.setVida(vida);
        this.damage = damage;
    }

    public void attack() {
        System.out.println(nome + " ataca causando " + damage + " de dano.");
    }

    public Inimigo clone() {
        try {
            return (Inimigo) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}


    // Getters and setters...
}