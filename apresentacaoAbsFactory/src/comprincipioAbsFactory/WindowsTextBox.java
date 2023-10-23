package comprincipioAbsFactory;

import comprincipioAbsFactory.interfaces.TextBox;

public class WindowsTextBox implements TextBox{
    @Override
    public void render() {
        System.out.println("Renderizando Caixa de Texto em padrão Windows");   
    }
}
