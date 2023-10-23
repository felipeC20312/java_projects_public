package comprincipioAbsFactory;

import comprincipioAbsFactory.interfaces.Button;

public class MacOSButton implements Button{
    @Override
    public void render() {
        System.out.println("Renderizando Botão em Padrão MacOS");
    }
}
