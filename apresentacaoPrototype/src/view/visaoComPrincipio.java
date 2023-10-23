package view;

import comprincipioPrototype.Inimigo;

public class visaoComPrincipio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inimigo prototypeInimigo = new Inimigo("Inimigo Genérico", 100, 10);

        Inimigo Inimigo1 = prototypeInimigo.clone();
        Inimigo1.attack();
        Inimigo1.setNome("Inimigo 1");

        Inimigo Inimigo2 = prototypeInimigo.clone();
        Inimigo2.attack();
        Inimigo2.setNome("Inimigo 2");
		
		   
	}

}
