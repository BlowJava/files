import javax.swing.*;
import java.awt.*;

public class java extends JFrame {
    Font Me = new Font("Serif", Font.ITALIC, 48);
    String str = "Ang Pogi Ni Patrick";
    public void paint(Graphics pen){
        super.paint(pen);
        pen.setFont(Me);
        pen.drawString(str, 10, 60);
    }
    public static void main(String[]args){
        java res = new java();
        res.setSize(420,100);
        res.setVisible(true);
    }
}