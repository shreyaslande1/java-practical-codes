import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Q1 extends Applet implements KeyListener {
    
    public void init() {
        addKeyListener(this);
        setFocusable(true);
    }
    
    public void keyPressed(KeyEvent e) {
        showStatus("Key pressed");
        setBackground(Color.RED);
        repaint();
    }
    
    public void keyReleased(KeyEvent e) {
        showStatus("Key released");
        setBackground(Color.GREEN);
        repaint();
    }
    
    public void keyTyped(KeyEvent e) {
        showStatus("Key Typed: " + e.getKeyChar());
        setBackground(Color.BLUE);
        repaint();
    }
}