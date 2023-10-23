package comprincipioAbsFactory;

import comprincipioAbsFactory.factory.GUIFactory;
import comprincipioAbsFactory.interfaces.Button;
import comprincipioAbsFactory.interfaces.TextBox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WindowsTextBox();
    }
}
