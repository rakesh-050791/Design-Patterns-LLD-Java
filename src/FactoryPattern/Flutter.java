package FactoryPattern;

public class Flutter {

    public void setTheme(){
        System.out.println("Theme is set");
    }

    public void setRefreshRate(){
        System.out.println("Refresh rate is set");
    }

    public UIFactory createUIFactory(SupportedPlatforms platform){
        return UIFactoryFactory.createUIFactoryForPlatforms(platform);
    }
}
