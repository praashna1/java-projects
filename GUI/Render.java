import javax.swing.*;
import java.awt.*;

public class Render {
    public static void main(String[] args) {
        JFrame frame=new JFrame("praashna");


        JPanel panel=new JPanel(){
        public void paint(Graphics g){
            Graphics2D g2D = (Graphics2D) g;
            g2D.setColor(Color.blue);

            g2D.setFont(new Font("Times New Roman",Font.ITALIC,30));
            g2D.drawString("we are learning advanced java", 100, 100);
        }
    };
        frame.add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);

    }
}
