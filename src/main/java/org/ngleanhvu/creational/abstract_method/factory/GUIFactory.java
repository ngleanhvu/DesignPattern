package org.ngleanhvu.creational.abstract_method.factory;

import org.ngleanhvu.creational.abstract_method.control.Button;
import org.ngleanhvu.creational.abstract_method.control.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckbox();
}
