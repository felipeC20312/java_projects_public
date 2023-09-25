package srp.comprincipio;

public class AcaoJogador {

   private Jogador jogador;
   private ItemJogador itemJogador; // Adiciona uma instância de ItemJogador

	public AcaoJogador(Jogador jogador, ItemJogador itemJogador) {
	    this.jogador = jogador;
	    this.itemJogador = itemJogador;
	}
	

    public void atacarInimigo() {
    	System.out.println("Atacou um Inimigo");
        jogador.ganharXP(1);
        jogador.calcularXp();
    }

    public void derrotarInimigo() {
    	System.out.println("Derrotou um Inimigo");
        jogador.ganharXP(10);
        jogador.calcularXp();
        itemJogador.recebeItem();
    }
    
}
