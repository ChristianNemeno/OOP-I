package GUI.Calculator;

import javax.swing.*;

public class calc extends JFrame{
    private JPanel pMain;
    private JTextField result;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnAdd;
    private JButton btnSub;
    private JButton btn6;
    private JButton btn5;
    private JButton btn4;
    private JButton btnMul;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnDiv;
    private JButton btnEquals;
    private JButton btn0;
    private JButton clear;


    public calc(){

    }

    public void logic(){

    }


    public static void main(String[] args) {
        calc s = new calc();
        s.setContentPane(s.pMain);
        s.setVisible(true);
        s.setSize(400,400);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
