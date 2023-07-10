package FactoryPattern;

public class IOSfactory implements UIFactory{

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    public Menu createMenu(){
        return new IOSMenu();
    }
}
