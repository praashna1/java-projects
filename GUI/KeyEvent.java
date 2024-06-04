import javax.swing.*;
import java.awt.event.KeyListener;

public class KeyEvent {
    public static void main(String[] args) {
        JFrame frame=new JFrame();

        JLabel label=new JLabel("textttt");

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                label.setText("tryped");
            }

            @Override
            public void keyPressed(java.awt.event.KeyEvent e) {
                label.setText("pressed");
            }

            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
              label.setText("relaesed");
            }
        });
        frame.add(label);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
