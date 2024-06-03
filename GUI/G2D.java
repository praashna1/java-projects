import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class G2D {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
//        frame.setBounds(100,100,500,500);
        JPanel j=new JPanel() {
            public void paint(Graphics g) {
                Graphics2D g2D = (Graphics2D) g;
                g2D.setColor(Color.red);
                g2D.drawLine(50,50,200,200);
                g2D.setColor(Color.blue);
//                g2D.drawOval(120,120,100,100);
                g2D.fillOval(10,120,100,100);
                g2D.setColor(Color.black);
//                g2D.drawRect(50,50,150,150);
                g2D.setColor(Color.yellow);
                g2D.fillRect(200,200,150,150);
                g2D.drawString("nist",50,50);
                g2D.setColor(Color.pink);
                g2D.setStroke(new BasicStroke(10));
                g2D.draw(new Line2D.Float(30,20,100,100));
            }

        };
        frame.add(j);
        frame.setSize(500,500);
        frame.setVisible(true);
//        frame.setDefaultCloseOperation(J);

    }
}
