package org.ngleanhvu.creational.abstract_method.factory;

import org.ngleanhvu.creational.abstract_method.control.Button;
import org.ngleanhvu.creational.abstract_method.control.CheckBox;
import org.ngleanhvu.creational.abstract_method.control.MacButton;
import org.ngleanhvu.creational.abstract_method.control.MacCheckBox;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacCheckBox();
    }
}
