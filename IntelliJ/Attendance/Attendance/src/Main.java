import Content.Sheet;
import ui.GUI;
import ui.UI;

import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sheet sheet = new Sheet();
        SwingUtilities.invokeLater(() -> new GUI(sheet));
//        UI uu = new UI(scanner, sheet);
//
//        uu.start();

    }
}