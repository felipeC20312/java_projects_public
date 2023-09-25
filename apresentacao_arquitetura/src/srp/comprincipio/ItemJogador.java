package srp.comprincipio;

public class ItemJogador {
	
	private Jogador jogador;
	
		public ItemJogador(Jogador jogador) {
	        this.jogador = jogador;
	    }

	    public void recebeItem() {
	        System.out.println("Ganhou item");
	    }
}

