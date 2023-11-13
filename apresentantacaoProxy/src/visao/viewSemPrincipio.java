package visao;

import semPrincicio.Cena;
import semPrincicio.CenaConcreta;


public class viewSemPrincipio {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Cenas são carregadas imediatamente durante a criação dos objetos
        Cena cena1 = new CenaConcreta("Cena 1");
        Cena cena2 = new CenaConcreta("Cena 2");
        Cena cena3 = new CenaConcreta("Cena 3");
        Cena cena4 = new CenaConcreta("Cena 4");

        // Todas as cenas estão carregadas e prontas para serem exibidas
        cena1.exibir();
        cena2.exibir();
        cena3.exibir();
        cena4.exibir();
		
		
	}
}
