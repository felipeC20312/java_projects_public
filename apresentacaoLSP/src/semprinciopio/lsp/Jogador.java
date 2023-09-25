package semprinciopio.lsp;

public class Jogador {
	private String nome;
	private int vida;
	
	 

	    public Jogador(String nome, int vida) {
	    	this.nome = nome;
	        this.vida = vida;
	    }

	    public void atacar(Inimigo inimigo) {
	    	inimigo.recebeDano(10);
	    	System.out.println("Jogador " + this.nome +  " atacou!");
	    }

		public String getNome() {
			return nome;
		}

		public int getVida() {
			return vida;
		}

}


