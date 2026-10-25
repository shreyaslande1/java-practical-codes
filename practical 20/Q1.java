import java.applet.Applet;
import java.awt.*;

public class Q1 extends Applet {
    Label lbl;
    TextField tf;
    CheckboxGroup cbg;
    Checkbox male, female;
    Button btn;
    
    public void init() {
        lbl = new Label("Enter name: ");
        tf = new TextField(20);
        cbg = new CheckboxGroup();
        male = new Checkbox("Male", cbg, false);
        female = new Checkbox("Female", cbg, false);
        btn = new Button("Submit");
        
        add(lbl);
        add(tf);
        add(male);
        add(female);
        add(btn);
    }
}