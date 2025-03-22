package org.ngleanhvu.creational.abstract_method.factory;

import org.ngleanhvu.creational.abstract_method.control.Button;
import org.ngleanhvu.creational.abstract_method.control.CheckBox;
import org.ngleanhvu.creational.abstract_method.control.WinButton;
import org.ngleanhvu.creational.abstract_method.control.WinCheckBox;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WinCheckBox();
    }
}
