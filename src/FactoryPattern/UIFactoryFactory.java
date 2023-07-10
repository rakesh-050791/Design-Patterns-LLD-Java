package FactoryPattern;

public class UIFactoryFactory {
        public static UIFactory createUIFactoryForPlatforms(SupportedPlatforms platform){
            if(platform.equals(SupportedPlatforms.ANDROID)){
                return new AndroidUIFactory();
            } else if (platform.equals(SupportedPlatforms.IOS)) {
                return new IOSfactory();
            }
            return null;
        }
}
