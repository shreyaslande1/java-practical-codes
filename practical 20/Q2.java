import java.applet.Applet;
import java.awt.*;

public class Q2 extends Applet {
    
    public void init() {
        add(new Label("Name :"));
        add(new TextField(20));
        add(new Button("Submit"));
        add(new Button("Clear"));
        add(new Checkbox("I agree"));
        
        CheckboxGroup cg = new CheckboxGroup();
        add(new Checkbox("Male", cg, true));
        add(new Checkbox("Female", cg, false));
        
        Choice ch = new Choice();
        ch.add("Java");
        ch.add("Python");
        ch.add("C++");
        add(ch);
        
        List lst = new List(4, true);
        lst.add("Red");
        lst.add("Blue");
        lst.add("Green");
        lst.add("Black");
        add(lst);
        
        add(new TextArea(5, 20));
    }
}