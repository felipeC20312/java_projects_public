package semprincipio;

public class Jogador {
	private String nome;
	private int posicaoX;
	private int level;
	private int xp;
	
	public Jogador(String nome) {
		this.nome = nome;
		this.xp = 0;
		this.posicaoX = 0;
	}
	
	public void andarParaEsquerda() {
	    posicaoX--;
	}

	public void andarParaDireita() {
	    posicaoX++;
	}
	
	public void atacarInimigo() {
		this.xp = this.xp + 1;
		calcularXp();
	}
	public void derrotarInimigo() {
		this.xp = this.xp + 10;
		System.out.println("Derrotou um Inimigo");
		calcularXp();
		recebeItem();
	}
	
    public void calcularXp() {
    	// Verifica se o XP é maior ou igual a 10 vezes o nível atual
        if (this.xp >= (10 * this.level)) {
            this.level = this.xp / 10; // Aumenta o nível
        }
    }
	
	public void recebeItem() {
		System.out.println("Ganhou item");
	}
	
	
	public int getXp() {
		return this.xp;
	}
	
	public int getLevel() {
		return this.level;
	}

	public String getNome() {
		return this.nome;
	}
	public int getPosicaoX() {
	    return posicaoX;
	}	
	

}
