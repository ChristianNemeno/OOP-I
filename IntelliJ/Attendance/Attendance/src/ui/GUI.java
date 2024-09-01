package ui;

import Content.Sheet;
import Content.Student;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private final Sheet s;
    private int i = 1;

    private JTextField nameField;
    private JTextField idField;
    private JTextArea outputArea;

    public GUI(Sheet s) {
        this.s = s;
        createComponents();
        setTitle("Student Management");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createComponents() {
        // Set up the layout
        setLayout(new BorderLayout());

        // Top panel for input
        JPanel inputPanel = new JPanel(new GridLayout(4, 2));

        // Components for "Add Student"
        inputPanel.add(new JLabel("Enter name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        JButton addButton = new JButton("Add Student");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                if (!name.isEmpty()) {
                    s.add(new Student(name, i++));
                    outputArea.append("Added Student: " + name + "\n");
                    nameField.setText("");
                }
            }
        });
        inputPanel.add(addButton);

        // Components for "Check Student ID"
        inputPanel.add(new JLabel("Enter ID:"));
        idField = new JTextField();
        inputPanel.add(idField);

        JButton checkButton = new JButton("Check ID");
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = Integer.parseInt(idField.getText());
                    s.present(id);
                    outputArea.append("Checked ID: " + id + "\n");
                    idField.setText("");
                } catch (NumberFormatException ex) {
                    outputArea.append("Invalid ID entered.\n");
                }
            }
        });
        inputPanel.add(checkButton);

        add(inputPanel, BorderLayout.NORTH);

        // Text area for displaying output
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        // Bottom panel for additional buttons
        JPanel bottomPanel = new JPanel();

        // "Print All Students" button
        JButton printButton = new JButton("Print All Students");
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String allStudents = s.print(); // Assuming this method returns a string
                outputArea.append(allStudents + "\n");
            }
        });
        bottomPanel.add(printButton);

        // "Exit" button
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Thank you for using");
                System.exit(0);
            }
        });
        bottomPanel.add(exitButton);

        add(bottomPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        // Assuming the Sheet class has a no-argument constructor
        Sheet sheet = new Sheet();
        new GUI(sheet);
    }
}
