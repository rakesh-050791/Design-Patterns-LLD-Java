package FactoryPattern;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory androidUIFactory =  flutter.createUIFactory(SupportedPlatforms.ANDROID);
        UIFactory iosUIFactory =  flutter.createUIFactory(SupportedPlatforms.IOS);

        Button button = androidUIFactory.createButton();
        button.showButton();

        Menu menu = androidUIFactory.createMenu();
        menu.showMenu();

        Button iosbutton = iosUIFactory.createButton();
        iosbutton.showButton();

        Menu iosmenu = iosUIFactory.createMenu();
        iosmenu.showMenu();
    }
}
