package semprinciopio.lsp;

public class Inimigo {
	 private String nome;
	 private int vida;

	    public Inimigo(String nome, int vida) {
	    	this.nome = nome;
	        this.vida = vida;
	    }

	    public void recebeDano(int damage) {
	        this.vida = this.vida - damage;
	    }

		public String getNome() {
			return this.nome;
		}
		
		public int getVida() {
			return this.vida;
		}
}

