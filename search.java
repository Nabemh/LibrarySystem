import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class LibrarySearchSystem extends JFrame {
    private JTextField searchBar;
    private JButton searchButton;
    private JTextArea resultsArea;
    private List<Book> books;

    public LibrarySearchSystem() {
        books = new ArrayList<>();
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", "1234567890"));
        books.add(new Book("1984", "George Orwell", "Dystopian", "2345678901"));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic", "3456789012"));
        books.add(new Book("Moby Dick", "Herman Melville", "Adventure", "4567890123"));

        setTitle("Library Search System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        searchBar = new JTextField(30);
        searchButton = new JButton("Search");

        resultsArea = new JTextArea(15, 50);
        resultsArea.setEditable(false);

        setLayout(new BorderLayout());
        JPanel northPanel = new JPanel();
        northPanel.add(new JLabel("Search:"));
        northPanel.add(searchBar);
        northPanel.add(searchButton);
        add(northPanel, BorderLayout.NORTH);
        add(new JScrollPane(resultsArea), BorderLayout.CENTER);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performSearch();
            }
        });


        searchBar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performSearch();
            }
        });
    }

    private void performSearch() {
        String query = searchBar.getText().toLowerCase();
        StringBuilder results = new StringBuilder();

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(query) ||
                    book.getAuthor().toLowerCase().contains(query) ||
                    book.getGenre().toLowerCase().contains(query) ||
                    book.getIsbn().toLowerCase().contains(query)) {
                results.append(book).append("\n");
            }
        }

        resultsArea.setText(results.length() > 0 ? results.toString() : "No results found.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LibrarySearchSystem().setVisible(true);
            }
        });
    }
}
