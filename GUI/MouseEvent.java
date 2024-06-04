import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class MouseEvent {
    public static void main(String[] args) {
        JFrame frame=new JFrame();


        JLabel label=new JLabel("mousee");


        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                label.setText("mouseclicked");
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                label.setText("mousepresses");
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                label.setText("mouserealeasd");
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
            label.setText("mouseentered");
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                label.setText("mouseexited");
            }
        });
        frame.add(label);
        frame.setSize(500,500);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
