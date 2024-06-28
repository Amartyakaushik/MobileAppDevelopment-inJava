import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo {
    JFrame frame;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    
    public GridLayoutDemo(){
        // frame = new JFrame();
        frame = new JFrame("FlowLayoutDemo");
        button1 = new JButton("Button1");
        button2 = new JButton("Button2");
        button3 = new JButton("Button3");
        button4 = new JButton("Button4");
        button5 = new JButton("Button5");
        button6 = new JButton("Button6");
        button7 = new JButton("Button7");
        button8 = new JButton("Button8");

        // frame.setLayout(new FlowLayout());
        
        frame.setLayout(new GridLayout(2,3,20,10));
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);

        frame.setSize(400,400);
        // frame.setBounds(200,300,400,600);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // new De();
        new GridLayoutDemo();
    }
    
}
