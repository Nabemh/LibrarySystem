import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LibraryManagement extends JFrame implements ActionListener {
    private JTextField textField1, textField2, textField3, textField4, textField5, textField6, textField7;
    private JButton addButton, viewButton, editButton, deleteButton, clearButton, reportButton, exitButton;
    private ArrayList<Book> books = new ArrayList<>();

    private class BackgroundPanel extends JPanel {
        private Image backgroundImage;

        public BackgroundPanel() {
            backgroundImage = new ImageIcon(getClass().getResource("/background.png")).getImage();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (backgroundImage != null) {
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }


    public LibraryManagement() {
        setTitle("Library Management System");
        setIconImage(Toolkit.getDefaultToolkit().getImage("appIcon.png"));
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        BackgroundPanel backgroundPanel = new BackgroundPanel();
        backgroundPanel.setLayout(new BorderLayout());

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridBagLayout());
        formPanel.setOpaque(false);

        GridBagConstraints construct = new GridBagConstraints();
        construct.fill = GridBagConstraints.HORIZONTAL;
        construct.insets = new Insets(5, 5, 5, 5);

        JLabel label1 = new JLabel("Book ID:");
        JLabel label2 = new JLabel("Book Title:");
        JLabel label3 = new JLabel("Author:");
        JLabel label4 = new JLabel("Publisher:");
        JLabel label5 = new JLabel("Year of Publication:");
        JLabel label6 = new JLabel("ISBN:");
        JLabel label7 = new JLabel("Number of Copies:");

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
        reportButton = new JButton("Report");
        exitButton = new JButton("Exit");

        addButton.addActionListener(this);
        viewButton.addActionListener(this);
        editButton.addActionListener(this);
        deleteButton.addActionListener(this);
        clearButton.addActionListener(this);
        reportButton.addActionListener(this);
        exitButton.addActionListener(this);

        construct.gridx = 0;
        construct.gridy = 0;
        formPanel.add(label1, construct);

        construct.gridx = 1;
        construct.gridy = 0;
        formPanel.add(textField1, construct);

        construct.gridx = 0;
        construct.gridy = 1;
        formPanel.add(label2, construct);

        construct.gridx = 1;
        construct.gridy = 1;
        formPanel.add(textField2, construct);

        construct.gridx = 0;
        construct.gridy = 2;
        formPanel.add(label3, construct);

        construct.gridx = 1;
        construct.gridy = 2;
        formPanel.add(textField3, construct);

        construct.gridx = 0;
        construct.gridy = 3;
        formPanel.add(label4, construct);

        construct.gridx = 1;
        construct.gridy = 3;
        formPanel.add(textField4, construct);

        construct.gridx = 0;
        construct.gridy = 4;
        formPanel.add(label5, construct);

        construct.gridx = 1;
        construct.gridy = 4;
        formPanel.add(textField5, construct);

        construct.gridx = 0;
        construct.gridy = 5;
        formPanel.add(label6, construct);

        construct.gridx = 1;
        construct.gridy = 5;
        formPanel.add(textField6, construct);

        construct.gridx = 0;
        construct.gridy = 6;
        formPanel.add(label7, construct);

        construct.gridx = 1;
        construct.gridy = 6;
        formPanel.add(textField7, construct);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(viewButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(reportButton);
        buttonPanel.add(exitButton);

        construct.gridx = 0;
        construct.gridy = 7;
        construct.gridwidth = 2;
        formPanel.add(buttonPanel, construct);

        backgroundPanel.add(formPanel, BorderLayout.CENTER);

        setContentPane(backgroundPanel);
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
        } else if (e.getSource() == reportButton) {
            generateReport();
        } else if (e.getSource() == exitButton) {
            exitApplication();
        }
    }

    private void addBook() {
        try {
            Book book = new Book(
                textField1.getText(),
                textField2.getText(),
                textField3.getText(),
                textField4.getText(),
                textField5.getText(),
                textField6.getText(),
                textField7.getText()
            );
            books.add(book);
            JOptionPane.showMessageDialog(this, "Book added successfully");
            clearFields();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values for Year and Number of Copies.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void editBook() {
        String bookID = JOptionPane.showInputDialog(this, "Enter book ID to edit:");
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(bookID)) {
                Book book = new Book(
                    bookID,
                    textField2.getText(),
                    textField3.getText(),
                    textField4.getText(),
                    textField5.getText(),
                    textField6.getText(),
                    textField7.getText()
                );
                books.set(i, book);
                JOptionPane.showMessageDialog(this, "Book edited successfully");
                clearFields();
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Book not found");
    }

    private void deleteBook() {
        String bookID = JOptionPane.showInputDialog(this, "Enter book ID to delete:");
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(bookID)) {
                books.remove(i);
                JOptionPane.showMessageDialog(this, "Book deleted successfully");
                clearFields();
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Book not found");
    }

    private void viewBooks() {
        BookTableModel model = new BookTableModel(books);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        JTextField searchField = new JTextField(20);
        JButton searchButton = new JButton("Search");

        JPanel searchPanel = new JPanel();
        searchPanel.add(new JLabel("Search:"));
        searchPanel.add(searchField);
        searchPanel.add(searchButton);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchText = searchField.getText();
                if (searchText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a book title to search.");
                    return;
                }
                boolean found = false;
                for (int i = 0; i < books.size(); i++) {
                    if (books.get(i).getTitle().equalsIgnoreCase(searchText)) {
                        found = true;
                        JOptionPane.showMessageDialog(null, "Book is available. Book number: " + (i + 1));
                        break;
                    }
                    
                }
                if (!found) {
                    JOptionPane.showMessageDialog(null, "Book unavailable.");
                }
            }
        });

        JFrame frame = new JFrame("View Books");
        frame.add(scrollPane);
        frame.setSize(800, 400);
        frame.setVisible(true);
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

    private void generateReport() {
        if (books.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No books in store", "Report", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder report = new StringBuilder();
        report.append("Book Report: \n\n");
        report.append(String.format("%-10s %-25s %-15s %-20s %-5s %-13s %-5s\n",
            "Book ID", "Title", "Author", "Publisher", "Year", "ISBN", "Copies"));

        for (Book book : books) {
            report.append(String.format("%-10s %-25s %-15s %-20s %-5s %-13s %-5s\n",
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getPublisher(),
                book.getYear(),
                book.getIsbn(),
                book.getCopies()));
        }

        JTextArea textArea = new JTextArea(report.toString());
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(700, 400));

        JOptionPane.showMessageDialog(this, scrollPane, "Book Report", JOptionPane.INFORMATION_MESSAGE);

        try (FileWriter writer = new FileWriter("LibraryReport.txt")) {
            writer.write(report.toString());
            JOptionPane.showMessageDialog(this, "Report has been saved to LibraryReport.txt", "File Saved", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "An Error Occurred while writing report to file", "File Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void exitApplication() {
        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}
