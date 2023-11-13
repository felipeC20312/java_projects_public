package visao;

import comPrincipio.Cena;
import comPrincipio.ProxyCena;

public class viewComPrincipio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cena cena1 = new ProxyCena("Cena 1");
        Cena cena2 = new ProxyCena("Cena 2");
        Cena cena3 = new ProxyCena("Cena 3");
        Cena cena4 = new ProxyCena("Cena 4");

        // Apenas as cenas que são exibidas são carregadas
        cena1.exibir();
        cena2.exibir();
        cena3.exibir();
        cena4.exibir();
	}

}
