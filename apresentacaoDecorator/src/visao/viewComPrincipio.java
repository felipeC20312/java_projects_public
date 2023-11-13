package visao;

import comPrincipio.*;

public class viewComPrincipio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Arma espada = new Espada();
        Arma espadaDeRaio = new EspadaDeRaio();

        Personagem guerreiro = new PersonagemBase("Conan", 100, espada);
        Personagem guerreiroComEspadaDeRaio = new ArmaDecorator(new PersonagemBase("Conan", 100, espada), espadaDeRaio);

        guerreiro.atacar();
        guerreiroComEspadaDeRaio.atacar();
	}

}
