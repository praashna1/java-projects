import javax.swing.*;

public class Frame {
    public static void main(String[] args) {

        JFrame j =new JFrame("login");
//        j.setBounds(100,100,100,100);

        JLabel u= new JLabel("Email:");
        u.setBounds(70,45,200,100);
        j.add(u);
        JTextField t =new JTextField();
        t.setBounds(140,80,230,30);
        j.add(t);
        JLabel pa= new JLabel("Password:");
        pa.setBounds(70,80,200,100);
        j.add(pa);
        JPasswordField p=new JPasswordField();
        p.setBounds(140,120,230,30);
        j.add(p);
        JButton button=new JButton("sign up");
        button.setBounds(140,180,100,30);
//        button.setSize(100,30);
        j.add(button);
        JButton but=new JButton("submit");
        but.setBounds(250,180,100,30);
//        but.setSize(100,30);
        j.add(but);
        j.setSize(500,500);
        j.setLayout(null);
        j.setVisible(true);

        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

