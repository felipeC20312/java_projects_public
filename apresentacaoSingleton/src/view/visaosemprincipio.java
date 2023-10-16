package view;

import semprincipioSingleton.Jogador;

public class visaosemprincipio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criando jogadores
		Jogador player1 = new Jogador("Jogador 1");
        Jogador player2 = new Jogador("Jogador 2");

        // Interagindo com os jogadores
        player1.calculavida(20);
        player2.calculaPonto(50);

        // Exibindo informações dos jogadores
        player1.mostraStatus();
        player2.mostraStatus();

	}

}


        