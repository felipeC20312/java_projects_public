package comprincipioAbsFactory;

import comprincipioAbsFactory.interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Renderizando Botão em padrão Windowns");
    }
}
