package org.ngleanhvu.creational.abstract_method;

import org.ngleanhvu.creational.abstract_method.control.Button;
import org.ngleanhvu.creational.abstract_method.control.CheckBox;
import org.ngleanhvu.creational.abstract_method.factory.GUIFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkBox = guiFactory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkBox.tick();
    }
}
