package comprincipio.view;

import comprincipio.AdaptadorTomada;
import comprincipio.TomadaDeDoisPinos;
import comprincipio.TomadaDeTresPinos;

public class Main {
    public static void main(String[] args) {
        TomadaDeDoisPinos tomadaDeDoisPinos = new TomadaDeDoisPinos();
        TomadaDeTresPinos tomadaDeTresPinos = new TomadaDeTresPinos();
        AdaptadorTomada adaptadorTomada = new AdaptadorTomada(tomadaDeTresPinos);

        tomadaDeDoisPinos.ligarTomada(); //Tomada de Dois Pinos liga normalmente
        adaptadorTomada.ligarTomada(); //Tomada de Três Pinos sofre adaptação e liga
    }
}
