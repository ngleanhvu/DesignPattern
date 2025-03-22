package org.ngleanhvu.creational.abstract_method;

import org.ngleanhvu.creational.abstract_method.factory.GUIFactory;
import org.ngleanhvu.creational.abstract_method.factory.MacFactory;
import org.ngleanhvu.creational.abstract_method.factory.WinFactory;

public class Main {

    private static Application configurationApp() {
        Application application;
        GUIFactory guiFactory = null;

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("mac")) {
            guiFactory = new MacFactory();
        }
        else if (os.contains("win")) {
            guiFactory = new WinFactory();
        }

        application = new Application(guiFactory);
        return application;
    }
    public static void main(String[] args) {
        Application application = Main.configurationApp();
        application.paint();
    }
}
