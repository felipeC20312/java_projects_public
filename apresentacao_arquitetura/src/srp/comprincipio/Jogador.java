package srp.comprincipio;

public class Jogador {
	private String nome;
	private int posicaoX;
	private int level;
	private int xp;
	
	public Jogador(String nome) {
		this.nome = nome;
		this.level = 0;
		this.xp = 0;
		this.posicaoX = 0;
	}
	
	public void andarParaEsquerda() {
	    posicaoX--;
	}

	public void andarParaDireita() {
	    posicaoX++;
	}
	
    public void calcularXp() {
    	// Verifica se o XP é maior ou igual a 10 vezes o nível atual
        if (this.xp >= (10 * this.level)) {
            this.level = this.xp / 10; // Aumenta o nível
        }
    } 
    
	public void ganharXP(int xpGanho /* quantidade de xp q vai ser adicionada ao jogador */) {
        xp += xpGanho;
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
