import java.applet.Applet;
import java.awt.Graphics;

/* 
<applet code="AdditionParam.class" width="400" height="150">
    <param name="No1" value="10">
    <param name="No2" value="20">
</applet> 
*/

public class Q2 extends Applet {
    
    public void paint(Graphics g) {
        String num1 = getParameter("No1");
        String num2 = getParameter("No2");
        
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        
        int sum = a + b;
        
        g.drawString("Addition: " + sum, 20, 70);
    }
}