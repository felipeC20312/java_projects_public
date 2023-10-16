package view;

import comprincipioSingleton.Jogador;

public class visaocomprincipio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Jogador player1 = Jogador.getInstance("Jogador Principal");
		Jogador player2 = Jogador.getInstance("Outro Jogador"); // Isso não criará uma nova instância

	        // Interagindo com o jogador principal
	        player1.calculavida(20);
	        player1.calculaPonto(50);

	        // Exibindo informações do jogador principal
	        player1.mostraStatus();
	        player2.mostraStatus(); // player2 é o mesmo jogador principal, as informações são as mesmas
		
	}

}
