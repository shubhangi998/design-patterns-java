package Factory;

import Factory.Components.Button.Button;
import Factory.Components.Dropdown.Dropdown;
import Factory.Components.Menu.Menu;

public interface UIFactory {
    public Button createButton();
    public Dropdown createDropdown();
    public Menu createMenu();
}
