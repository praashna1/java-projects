import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseDragged {
        public static void main(String[] args) {
            JFrame frame=new JFrame();
            frame.addMouseMotionListener(new MouseAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    super.mouseDragged(e);
                    Graphics g=frame.getGraphics();
                    g.setColor(Color.pink);
                    g.fillOval(e.getX(),e.getY(),10,10);
                }
            });

            frame.setSize(500,500);
            frame.setLayout(null);
            frame.setVisible(true);
        }
    }
