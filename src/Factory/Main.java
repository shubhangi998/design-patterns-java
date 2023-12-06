package Factory;

import Factory.Components.Button.Button;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory("IOS");
        Button button = uiFactory.createButton();
        System.out.println(button.getSize());
    }
}
