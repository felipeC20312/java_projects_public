package view.sempricipioAbsFactory;

import semprincipioAbsFactory.MacOSButton;
import semprincipioAbsFactory.MacOSTextBox;
import semprincipioAbsFactory.WindowsButton;
import semprincipioAbsFactory.WindowsTextBox;

public class Main {
    public static void main(String[] args) {
         String os = "Windows";  // Poderia ser MacOS
        if (os.equals("Windows")) {
            WindowsButton button = new WindowsButton();
            WindowsTextBox textBox = new WindowsTextBox();
            button.render();
            textBox.render();
        } else if (os.equals("MacOS")) {
            MacOSButton button = new MacOSButton();
            MacOSTextBox textBox = new MacOSTextBox();
            button.render();
            textBox.render();
        }
    }
}
