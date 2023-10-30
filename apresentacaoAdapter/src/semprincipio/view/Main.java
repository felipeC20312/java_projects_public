package semprincipio.view;

import comprincipio.TomadaDeDoisPinos;
// import comprincipio.TomadaDeTresPinos;

public class Main {
    public static void main(String[] args) {
        TomadaDeDoisPinos tomadaDeDoisPinos = new TomadaDeDoisPinos();
        // TomadaDeTresPinos tomadaDeTresPinos = new TomadaDeTresPinos();
        
        // Não podemos conectar diretamente
        tomadaDeDoisPinos.ligarTomada();
        //tomadaDeDoisPinos.ligarTomadaDeTresPinos(); // Não funciona
        
        // Nem usar TomadaDeTresPinos diretamente
        //tomadaDeTresPinos.ligarTomadaDeTresPinos();
    }
}
