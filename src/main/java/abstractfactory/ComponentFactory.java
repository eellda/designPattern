package abstractfactory;

public abstract class ComponentFactory {
    public abstract Button createButton(String caption);
    public abstract CheckBox createCheckBox(boolean bChecked);
    public abstract TextEditer createTextEditor(String value);
}
