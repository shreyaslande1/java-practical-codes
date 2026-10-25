import java.applet.Applet;
import java.awt.*;

public class Q1 extends Applet {
    
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(150, 70, 185, 90);
        g.drawLine(185, 90, 220, 65);
        
        int x[] = {120, 190, 270};
        int y[] = {170, 100, 170};
        
        g.setColor(Color.GREEN);
        g.fillPolygon(x, y, 3);
        
        g.setColor(Color.GRAY);
        g.fillOval(110, 160, 170, 170);
        
        g.setColor(Color.BLACK);
        g.drawOval(160, 155, 160, 160);
        
        g.setColor(Color.YELLOW);
        g.drawOval(50, 205, 55, 40);
        
        g.setColor(Color.BLACK);
        g.drawOval(50, 205, 55, 40);
        
        g.setColor(Color.YELLOW);
        g.drawOval(260, 205, 55, 40);
        
        g.setColor(Color.BLACK);
        g.drawOval(260, 205, 55, 40);
        
        g.setColor(Color.GREEN);
        g.fillRect(125, 175, 45, 8);
        g.fillRect(195, 175, 45, 8);
        
        g.setColor(Color.RED);
        g.fillOval(135, 190, 28, 48);
        
        g.setColor(Color.BLACK);
        g.drawOval(135, 190, 28, 48);
        
        g.setColor(Color.BLUE);
        g.fillOval(140, 195, 18, 38);
        
        g.setColor(Color.YELLOW);
        g.fillOval(145, 201, 10, 25);
        
        g.setColor(Color.RED);
        g.fillOval(200, 190, 28, 48);
        
        g.setColor(Color.BLUE);
        g.fillOval(205, 195, 18, 38);
        
        g.setColor(Color.YELLOW);
        g.fillOval(210, 201, 10, 25);
        
        int nx[] = {185, 170, 200};
        int ny[] = {235, 270, 270};
        
        g.setColor(Color.BLUE);
        g.fillPolygon(nx, ny, 3);
        
        g.setColor(Color.BLACK);
        g.drawPolygon(nx, ny, 3);
        
        g.setColor(Color.YELLOW);
        g.fillOval(155, 280, 65, 15);
        
        g.setColor(Color.BLACK);
        g.drawOval(155, 280, 65, 15);
    }
}