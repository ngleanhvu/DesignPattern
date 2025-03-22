package org.ngleanhvu.creational.abstract_method.control;

public class WinCheckBox implements CheckBox {
    @Override
    public void tick() {
        System.out.println("Window checkbox ticked");
    }
}
