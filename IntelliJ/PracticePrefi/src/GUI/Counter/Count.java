package GUI.Counter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Count extends JFrame{
    private JPanel pMain;
    private JTextField textField1;
    private JButton countButton;
    int count =0;


    public Count(){
        textField1.setText(String.valueOf(count));
        listeners();

    }


    public void listeners(){
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                textField1.setText(String.valueOf(count));
            }
        });
    }



    public static void main(String[] args) {
        Count s = new Count();
        s.setTitle("AWT Counter");
        s.setVisible(true);
        s.setContentPane(s.pMain);
        s.setSize(400,200);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
