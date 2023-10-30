package view.comprincipioAbsFactory;

import comprincipioAbsFactory.MacOSFactory;
import comprincipioAbsFactory.WindowsFactory;
import comprincipioAbsFactory.factory.GUIFactory;
import comprincipioAbsFactory.interfaces.Button;
import comprincipioAbsFactory.interfaces.TextBox;

public class Main {
    public static void renderGUI(GUIFactory factory) {
        Button button = factory.createButton();
        TextBox textBox = factory.createTextBox();
        button.render();
        textBox.render();
    }

    public static void main(String[] args) {
        String os = "Windows";  // Poderia ser MacOS
        if (os.equals("Windows")) {
            renderGUI(new WindowsFactory());
        } else if (os.equals("MacOS")) {
            renderGUI(new MacOSFactory());
        }
    }
}
