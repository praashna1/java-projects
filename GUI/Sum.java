import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class Sum {
    public static void main(String[] args) {
        JFrame frame=new JFrame();

        JLabel num1= new JLabel("Num1");
        num1.setBounds(70,45,200,100);
        frame.add(num1);
        JTextField t =new JTextField();
        t.setBounds(140,80,230,30);
        frame.add(t);
        JLabel num2= new JLabel("Num2");
        num2.setBounds(70,80,200,100);
        frame.add(num2);
        JTextField p=new JTextField();
        p.setBounds(140,120,230,30);
        frame.add(p);
        JButton button=new JButton("Sum");
        button.setBounds(140,180,100,30);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int first=Integer.parseInt(t.getText());
               int second=Integer.parseInt(p.getText());
               int sum=first+second;
               JOptionPane.showMessageDialog(frame,"the sum is:" +sum);

            }
        });


        frame.add(num1);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
