package View;

//import semprinciopio.lsp.Inimigo;
//import semprinciopio.lsp.Jogador;
//import semprinciopio.lsp.Jogo;

import comprincipio.lsp.Inimigo;
import comprincipio.lsp.Jogador;
import comprincipio.lsp.Jogo;
import comprincipio.lsp.Personagem;



public class Visao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instâncias de Jogador e Inimigo
//		Jogador jogador = new Jogador("Panda", 100);
//		Inimigo inimigo = new Inimigo("zombie", 50);
		
		 Personagem jogador = new Jogador("Panda", 100);
	     Personagem inimigo = new Inimigo("Zombie", 50);
	     
		 // Mostrando informações
		System.out.println("Nome do jogador é: " + jogador.getNome() + " O inimigo é do tipo: " + inimigo.getNome());
		
		
		// Realizando combate
		 Jogo.combate(jogador, inimigo);
		 Jogo.combate(jogador, inimigo);
		 	 


		

	}
}
