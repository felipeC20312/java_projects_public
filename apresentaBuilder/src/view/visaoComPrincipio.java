package view;

import comprincipioBuilder.Jogador;

public class visaoComPrincipio {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Jogador Jogador = new Jogador.Builder("Jepeto", "Guerreiro")
                .nivel(10)
                .pontosDeVida(100)
                .build();
            Jogador.mostrarStatus();

	}

}
