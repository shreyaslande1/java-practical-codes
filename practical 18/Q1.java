import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Q1 extends Applet implements MouseListener {
    
    public void init() {
        addMouseListener(this);
    }
    
    public void mouseClicked(MouseEvent e) {
        showStatus("Mouse clicked");
        setBackground(Color.RED);
        repaint();
    }
    
    public void mousePressed(MouseEvent e) {
        showStatus("Mouse pressed");
        setBackground(Color.GREEN);
        repaint();
    }
    
    public void mouseReleased(MouseEvent e) {
        showStatus("Mouse released");
        setBackground(Color.BLUE);
        repaint();
    }
    
    public void mouseEntered(MouseEvent e) {
        showStatus("Mouse entered");
        setBackground(Color.BLACK);
        repaint();
    }
    
    public void mouseExited(MouseEvent e) {
        showStatus("Mouse exited");
        setBackground(Color.YELLOW);
        repaint();
    }
}