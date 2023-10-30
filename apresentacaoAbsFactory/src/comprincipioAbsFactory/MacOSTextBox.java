package comprincipioAbsFactory;

import comprincipioAbsFactory.interfaces.TextBox;

public class MacOSTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Renderizando Caixa de Texto em Padrão MacOS");
    }
}
