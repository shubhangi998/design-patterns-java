package Factory;

public class Flutter {
    public UIFactory createUIFactory(String platform){
        return UIFactoryFactory.getUIFactoryByPlatform(platform);
    }
}
