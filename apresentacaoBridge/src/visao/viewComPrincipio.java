package visao;

import comprincipio.Controle;
import comprincipio.ControleDeJogo;
import comprincipio.Plataforma;
import comprincipio.PlataformaConsole;
import comprincipio.PlataformaPC;

public class viewComPrincipio {
    public static void main(String[] args) {
        Plataforma plataformaConsole = new PlataformaConsole();
        Controle controleConsole = new ControleDeJogo(plataformaConsole);

        controleConsole.moverDireita();
        controleConsole.moverEsquerda();

        Plataforma plataformaPC = new PlataformaPC();
        Controle controlePC = new ControleDeJogo(plataformaPC);

        controlePC.moverDireita();
        controlePC.moverEsquerda();
    }
}
