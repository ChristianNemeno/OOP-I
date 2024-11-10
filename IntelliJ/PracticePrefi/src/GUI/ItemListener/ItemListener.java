package GUI.ItemListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class ItemListener extends JFrame{
    private JCheckBox cCH;
    private JCheckBox cppCH;
    private JCheckBox cSharpCH;
    private JCheckBox javaCH;
    private JCheckBox pythonCH;
    private JComboBox comboBox1;
    private JPanel pMain;
    private JLabel placeHolderLang;
    private JLabel placeHolderPro;


    public ItemListener(){
        logic();
    }




    public void logic(){
        ArrayList<String> langs = new ArrayList<>();
        JCheckBox[] boxes = {cCH,cppCH,cSharpCH,javaCH,pythonCH};

        for(JCheckBox x : boxes){
            x.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(x.isSelected()){
                        langs.add(x.getText());
                        placeHolderLang.setText(langs.toString());
                    }
                    if(!x.isSelected()){
                        langs.remove(x.getText());
                        placeHolderLang.setText(langs.toString());
                    }
                }
            });
        }






        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placeHolderPro.setText((String) comboBox1.getSelectedItem());

            }
        });

    }
    public static void main(String[] args) {
        ItemListener s = new ItemListener();
        s.setContentPane(s.pMain);
        s.setVisible(true);
        s.setSize(400,400);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}
