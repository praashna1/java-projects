import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEvent {
    public static void main(String[] args) {
        JFrame frame=new JFrame("button event");

        JButton but=new JButton("click me");
        but.setBounds(200,190,100,30);
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("button clicked");
                JOptionPane.showMessageDialog(frame,"button clicked");
            }
        });
        frame.add(but);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}
