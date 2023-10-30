package comprincipio;

public class PlataformaConsole implements Plataforma {
    @Override
    public void mover(String direcao) {
        System.out.println("Pressionando botão no controle do console: " + direcao);
    }
}