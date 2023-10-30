package comprincipio;

public class PlataformaPC implements Plataforma {
    @Override
    public void mover(String direcao) {
        System.out.println("Pressionando tecla no teclado: " + direcao);
    }
}