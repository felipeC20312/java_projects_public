package View;


//semprincipio.Jogador;
import srp.comprincipio.Jogador;
import srp.comprincipio.AcaoJogador;
import srp.comprincipio.ItemJogador;

public class comandosVisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jogador jogador1 = new Jogador("Panda");
		ItemJogador itemJogador1 = new ItemJogador(jogador1);
		AcaoJogador acaoJogador1 = new AcaoJogador(jogador1, itemJogador1);
		
		
		String nomeJogador = jogador1.getNome();
	
		jogador1.andarParaDireita();
		jogador1.andarParaDireita();
		jogador1.andarParaDireita();
		
		System.out.println(nomeJogador);
		
		System.out.println("Nome do Jogadar é: " + nomeJogador + " ele esta na posição " + jogador1.getPosicaoX() + " e seu Level atual é: " + jogador1.getLevel() + " e ele tem: " + jogador1.getXp() + " de Xp");
	
		//com SRP
		acaoJogador1.atacarInimigo();
		acaoJogador1.derrotarInimigo();

		System.out.println("Nome do Jogadar é: " + nomeJogador + " ele esta na posição " + jogador1.getPosicaoX() + " e seu Level atual é: " + jogador1.getLevel() + " e ele tem: " + jogador1.getXp() + " de Xp");

		
		
		/*Modelo sem srp
		 * jogador1.atacarInimigo(); 
		 * jogador1.derrotarInimigo();
		 * jogador1.derrotarInimigo(); 
		 * jogador1.derrotarInimigo();
		 */

	
//		System.out.println("Nível atual: " + jogador1.getLevel());
//		System.out.println("Nome do Jogadar é: " + nomeJogador + " e seu Level atual é: " + jogador1.getLevel() + " e ele tem: " + jogador1.getXp() + " de Xp");

		
		
		
		
	}

}
