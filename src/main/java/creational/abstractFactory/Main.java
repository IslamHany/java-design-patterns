package creational.abstractFactory;

public class Main {
    public static void main(String[] args){
        Button macOSButton;
        Button windowsButton;

        CheckBox macOSBCheckBox;
        CheckBox windowsCheckBox;

        GUIFactory macOSFactory = new MacOSFactory();
        macOSButton = macOSFactory.createButton();
        macOSBCheckBox = macOSFactory.createCheckBox();

        macOSButton.paint();
        macOSBCheckBox.paint();

        GUIFactory windowsFactory = new WindowsFactory();
        windowsButton = windowsFactory.createButton();
        windowsCheckBox = windowsFactory.createCheckBox();

        windowsButton.paint();
        windowsCheckBox.paint();
    }
}
