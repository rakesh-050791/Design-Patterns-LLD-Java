package FactoryPattern;

public class AndroidUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    public Menu createMenu(){
        return new AndroidMenu();
    }
}
