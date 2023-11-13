package visao;

import semPrincipio.Personagem;

public class viewSemPrincipio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Personagem guerreiro = new Personagem("Conan", 100, "espada");
		guerreiro.atacar();

        // Atualizando a arma do guerreiro
        guerreiro.arma = "espada de raio";
        guerreiro.atacar();
	}

}
