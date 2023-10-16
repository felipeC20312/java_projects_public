package view;

import comFactoryMethod.*;

public class visaocomprincipio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ClasseFactory factory1 = new GuerreiroFactory();
        Jogador jogador1 = factory1.criarJogador("João");
        jogador1.escolherClasse();
        
        ClasseFactory factory2 = new MagoFactory();
        Jogador jogador2 = factory2.criarJogador("Maria");
        jogador2.escolherClasse();
	}

}

