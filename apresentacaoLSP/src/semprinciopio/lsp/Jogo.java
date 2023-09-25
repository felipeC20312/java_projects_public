package semprinciopio.lsp;

public class Jogo {

	public static void combate(Jogador jogador, Inimigo inimigo) {
			jogador.atacar(inimigo);
	        System.out.println("Vida do Inimigo "+ inimigo.getNome() + " é: " + inimigo.getVida());
	    }

}
