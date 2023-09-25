package View;


import ocp.comprincipio.*;


public class Visao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Guerreiro guerreiro = new Guerreiro();
        Mago mago = new Mago();

        Jogador jogador1 = new Jogador("Jogador 1", guerreiro);
        Jogador jogador2 = new Jogador("Jogador 2", mago);

        jogador1.usarHabilidade(); // Usar habilidade especial do Guerreiro
        jogador2.usarHabilidade(); // Usar habilidade especial do Mago

	}

}
