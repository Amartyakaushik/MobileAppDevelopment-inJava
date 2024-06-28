import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CardLayoutDemo implements ActionListener {
    JFrame frame;
    JPanel cardDeck;
    CardLayout cl;

    JButton next;
    JButton previous;
    JButton first;
    JButton last;
    JButton show;

    JTextField textField;

    CardLayoutDemo(){
        frame = new JFrame("CardLayoutDemo");
        cardDeck = new JPanel();
        cl = new CardLayout();
        cardDeck.setLayout(cl);
        
        
        next = new JButton("Next!");
        previous = new JButton("Previous!");
        first = new JButton("First!");
        last = new JButton("Last!");
        show = new JButton("Show!");

        
        // first.addActionListener(new Demo1());
        // last.addActionListener(new Demo1());
        // next.addActionListener(new Demo1());
        // previous.addActionListener(new Demo1());
        // show.addActionListener(new Demo1());
        
        first.addActionListener(this);
        last.addActionListener(this);
        next.addActionListener(this);
        previous.addActionListener(this);
        show.addActionListener(this);
   
        JPanel NorthPanel = new JPanel();
        textField = new JTextField(10);
        NorthPanel.add(show);
        NorthPanel.add(textField);

        JPanel panel1 = new JPanel();
        panel1.add(new JButton("Panel1 Button1"));
        panel1.add(new JButton("Panel1 Button2"));
        panel1.add(new JButton("Panel1 Button3"));

        JPanel panel2 = new JPanel();
        panel2.add(new JButton("Panel2 Button1"));
        panel2.add(new JButton("Panel2 Button2"));

        JPanel panel3 = new JPanel(new GridLayout(2,2));
        panel3.add(new JButton("panel3 Button1"));
        panel3.add(new JButton("panel3 Button2"));
        panel3.add(new JButton("panel3 Button3"));
        panel3.add(new JButton("panel3 Button4"));


        cardDeck.add("card1",panel1);
        cardDeck.add("card2",panel2);
        cardDeck.add("card1",panel3);

        frame.add(next,BorderLayout.NORTH);
        // frame.add(NorthPanel,BorderLayout.NORTH);
        frame.add(previous,BorderLayout.SOUTH);
        frame.add(first,BorderLayout.EAST);
        frame.add(last,BorderLayout.WEST);
        frame.add(cardDeck);

        frame.setSize(400,400);
        frame.setVisible(true);
        }

        public static  void  main(String args[]){
            new CardLayoutDemo();
        }

        public void actionPerformed(ActionEvent e){
            String s = e.getActionCommand();
            switch(s){
                case "FIRST":
                    cl.first(cardDeck);
                    break;
                case "LAST":
                    cl.last(cardDeck);
                    break;
                case "NEXT":
                    cl.next(cardDeck);
                    break;
                case "PREVIOUS":
                    cl.previous(cardDeck);
                    break;
                // case "SHOW":
                //     cl.show(cardDeck,textField.getText());
                //     break;
                // cardDeck.show(cardDeck,"card1");
            }
        }
        }

        // class Demo1 implements ActionListener{
        //     public void actionPerformed(ActionEvent e){
        //         String s = e.getActionCommand();
        //         CardLayoutDemo d = new CardLayoutDemo();
        //         switch(s){
        //             case "FIRST":
        //                 d.cl.first(d.cardDeck);
        //                 break;
        //             case "LAST":
        //                 d.cl.last(d.cardDeck);
        //                 break;
        //             case "NEXT":
        //                 d.cl.next(d.cardDeck);
        //                 break;
        //             case "PREVIOUS":
        //                 d.cl.previous(d.cardDeck);
        //                 break;
        //             // case "SHOW":
        //             //     cl.show(cardDeck,textField.getText());
        //             //     break;
        //             // cardDeck.show(cardDeck,"card1");
        //         }
        //     }
        // }