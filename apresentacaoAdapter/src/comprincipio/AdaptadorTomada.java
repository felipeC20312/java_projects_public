package comprincipio;

public class AdaptadorTomada extends TomadaDeDoisPinos {
    private TomadaDeTresPinos tomadaDeTresPinos;

    public AdaptadorTomada(TomadaDeTresPinos tomadaDeTresPinos) {
        this.tomadaDeTresPinos = tomadaDeTresPinos;
    }

    public void ligarTomada() {
        System.out.println("Adaptador conectado.");
        tomadaDeTresPinos.ligarTomada();
    }
}
