package comprincipioAbsFactory.factory;

import comprincipioAbsFactory.interfaces.Button;
import comprincipioAbsFactory.interfaces.TextBox;

public interface GUIFactory {
    Button createButton();
    TextBox createTextBox();
}
