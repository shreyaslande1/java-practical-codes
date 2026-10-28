import java.applet.Applet;
import java.awt.*;

/* 
<applet code="Q2.class" width="500" height="400">
</applet> 
*/

public class Q2 extends Applet {
    
    public void paint(Graphics g) {
        setBackground(Color.LIGHT_GRAY);
        
        int x[] = {40, 200, 355};
        int y[] = {130, 40, 130};
        
        g.setColor(Color.BLUE);
        g.fillPolygon(x, y, 3);
        
        g.setColor(Color.YELLOW);
        g.fillRect(100, 130, 200, 210);
        
        g.setColor(Color.BLUE);
        g.fillRect(120, 150, 50, 50);
        
        g.setColor(Color.BLUE);
        g.fillRect(230, 150, 50, 50);
        
        g.setColor(Color.BLUE);
        g.fillRect(210, 260, 75, 80);
        
        g.setColor(Color.BLACK);
        g.fillOval(215, 300, 7, 8);
        
        g.setColor(Color.GREEN);
        g.fillRect(20, 340, 460, 10);
        
        g.setColor(Color.BLACK);
        g.fillRect(370, 270, 7, 130);
        
        int x1[] = {350, 375, 400, 410, 410, 400, 375, 350};
        int y1[] = {185, 170, 185, 205, 225, 240, 240, 225};
        
        g.setColor(Color.RED);
        g.fillPolygon(x1, y1, 8);
        
        g.setColor(Color.BLACK);
        g.drawString("STOP", 361, 208);
    }
}