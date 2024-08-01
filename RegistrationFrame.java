import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationFrame extends JFrame {

    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private final JButton registerButton;

    public RegistrationFrame() {
        Image backgroundImage = new ImageIcon("background.png").getImage();

        BackgroundPanel backgroundPanel = new BackgroundPanel(backgroundImage);
        backgroundPanel.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameField = new JTextField(15);

        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameField = new JTextField(15);

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(15);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(15);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField(15);

        registerButton = new JButton("Register");

        gbc.gridx = 0;
        gbc.gridy = 0;
        backgroundPanel.add(firstNameLabel, gbc);

        gbc.gridy++;
        backgroundPanel.add(firstNameField, gbc);

        gbc.gridy++;
        backgroundPanel.add(lastNameLabel, gbc);

        gbc.gridy++;
        backgroundPanel.add(lastNameField, gbc);

        gbc.gridy++;
        backgroundPanel.add(usernameLabel, gbc);

        gbc.gridy++;
        backgroundPanel.add(usernameField, gbc);

        gbc.gridy++;
        backgroundPanel.add(passwordLabel, gbc);

        gbc.gridy++;
        backgroundPanel.add(passwordField, gbc);

        gbc.gridy++;
        backgroundPanel.add(confirmPasswordLabel, gbc);

        gbc.gridy++;
        backgroundPanel.add(confirmPasswordField, gbc);

        gbc.gridy++;
        backgroundPanel.add(registerButton, gbc);

        add(backgroundPanel);
        pack();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                if (firstName.isEmpty() || lastName.isEmpty() || username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(RegistrationFrame.this, "Please fill all fields");
                } else {
                    if (password.equals(confirmPassword)) {
                        System.out.println("User registered successfully!");
                        dispose();
                        LibraryManagement libraryManagementFrame = new LibraryManagement();
                        libraryManagementFrame.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(RegistrationFrame.this, "Passwords do not match!");
                    }
                }
            }
        });
    }

    private static class BackgroundPanel extends JPanel {
        private final Image backgroundImage;

        public BackgroundPanel(Image backgroundImage) {
            this.backgroundImage = backgroundImage;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (backgroundImage != null) {
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }
}
