package comprincipioAbsFactory;

import comprincipioAbsFactory.factory.GUIFactory;
import comprincipioAbsFactory.interfaces.Button;
import comprincipioAbsFactory.interfaces.TextBox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MacOSTextBox();
    }
}
