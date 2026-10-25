import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class Q1 extends Applet {
    
    public void init() {
        setBackground(Color.RED);
        setForeground(Color.YELLOW);
    }
    
    public void paint(Graphics g) {
        g.drawString("Shreyas", 10, 50);
        g.drawString("2407601", 10, 100);
        g.drawString("IT", 10, 150);
    }
}