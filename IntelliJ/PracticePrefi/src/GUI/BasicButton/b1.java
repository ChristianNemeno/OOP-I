package GUI.BasicButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class b1 extends JFrame{
    private JPanel pMain;
    private JButton button1;
    private JTextField fu;
    private JButton button2;
    int num =0;
    public b1(){
        display();
        logic();

    }

    public void logic(){
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               num++;
               fu.setText(num + "");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num--;
                fu.setText(num + "");
            }
        });
    }

    public void display(){
        this.setContentPane(pMain);
        this.setVisible(true);
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        b1 s = new b1();

    }
}
