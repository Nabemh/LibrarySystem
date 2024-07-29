import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class LibraryManagement extends JFrame implements ActionListener {
    private JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7;
    private JButton addButton, viewButton, editButton, deleteButton, clearButton, exitButton;
    private ArrayList<Book> books = new ArrayList<>();

    public LibraryManagement() {
        setTitle("Library Management System");
        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Book ID");
        JLabel label2 = new JLabel("Book Title");
        JLabel label3 = new JLabel("Author");
        JLabel label4 = new JLabel("Publisher");
        JLabel label5 = new JLabel("Year of Publication");
        JLabel label6 = new JLabel("ISBN");
        JLabel label7 = new JLabel("Number of Copies");

        textField1 = new JTextField(10);
        textField2 = new JTextField(20);
        textField3 = new JTextField(20);
        textField4 = new JTextField(20);
        textField5 = new JTextField(10);
        textField6 = new JTextField(20);
        textField7 = new JTextField(10);

        addButton = new JButton("Add");
        viewButton = new JButton("View");
        editButton = new JButton("Edit");
        deleteButton = new JButton("Delete");
        clearButton = new JButton("Clear");
        exitButton = new JButton("Exit");

        addButton.addActionListener(this);
        viewButton.addActionListener(this);
        editButton.addActionListener(this);
        deleteButton.addActionListener(this);
        clearButton.addActionListener(this);
        exitButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints construct = new GridBagConstraints();
        construct.fill = GridBagConstraints.HORIZONTAL;
        construct.insets = new Insets(5, 5, 5, 5);

        construct.gridx = 0;
        construct.gridy = 0;
        panel.add(label1, construct);

        construct.gridx = 1;
        construct.gridy = 0;
        panel.add(textField1, construct);

        construct.gridx = 0;
        construct.gridy = 1;
        panel.add(label2, construct);

        construct.gridx = 1;
        construct.gridy = 1;
        panel.add(textField2, construct);

        construct.gridx = 0;
        construct.gridy = 2;
        panel.add(label3, construct);

        construct.gridx = 1;
        construct.gridy = 2;
        panel.add(textField3, construct);

        construct.gridx = 0;
        construct.gridy = 3;
        panel.add(label4, construct);

        construct.gridx = 1;
        construct.gridy = 3;
        panel.add(textField4, construct);

        construct.gridx = 0;
        construct.gridy = 4;
        panel.add(label5, construct);

        construct.gridx = 1;
        construct.gridy = 4;
        panel.add(textField5, construct);

        construct.gridx = 0;
        construct.gridy = 5;
        panel.add(label6, construct);

        construct.gridx = 1;
        construct.gridy = 5;
        panel.add(textField6, construct);

        construct.gridx = 0;
        construct.gridy = 6;
        panel.add(label7, construct);

        construct.gridx = 1;
        construct.gridy = 6;
        panel.add(textField7, construct);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(viewButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(exitButton);

        construct.gridx = 0;
        construct.gridy = 7;
        construct.gridwidth = 2;
        panel.add(buttonPanel, construct);

        add(panel);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            addBook();
        } else if (e.getSource() == viewButton) {
            viewBooks();
        } else if (e.getSource() == editButton) {
            editBook();
        } else if (e.getSource() == deleteButton) {
            deleteBook();
        } else if (e.getSource() == clearButton) {
            clearFields();
        } else if (e.getSource() == exitButton) {
            exitApplication();
        }
    }

    private void clearFields() {
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textField6.setText("");
        textField7.setText("");
    }

    private void exitApplication() {
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}
