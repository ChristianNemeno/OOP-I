package GUI.KeyEvent;

import javax.swing.*;
import java.awt.event.KeyAdapter;

public class KeyEvent extends JFrame {
    private JPanel pMain;
    private JTextArea textArea1;
    private JTextArea textArea2;


    public KeyEvent(){
        display();
        logic();
    }


    public void logic(){
        textArea1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                super.keyTyped(e);
                Character ch = e.getKeyChar();
                if( "AEIOUaeiou".indexOf(ch) >= 0){
                    textArea2.append(Character.toUpperCase(ch) + "");
                }else{
                    textArea2.append(ch + "");
                }
            }
        });
    }

    public void display(){
        this.setContentPane(pMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(400,500);
    }

    public static void main(String[] args) {
        KeyEvent s = new KeyEvent();


    }
}
