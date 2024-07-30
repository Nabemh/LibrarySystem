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
       JPanel panel = new JPanel(new GridBagLayout());
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
    panel.add(firstNameLabel, gbc);

    gbc.gridy++;
    panel.add(firstNameField, gbc);

    gbc.gridy++;
    panel.add(lastNameLabel, gbc);

    gbc.gridy++;
    panel.add(lastNameField, gbc);

    gbc.gridy++;
    panel.add(usernameLabel, gbc);

    gbc.gridy++;
    panel.add(usernameField, gbc);

    gbc.gridy++;
    panel.add(passwordLabel, gbc);

    gbc.gridy++;
    panel.add(passwordField, gbc);

    gbc.gridy++;
    panel.add(confirmPasswordLabel, gbc);

    gbc.gridy++;
    panel.add(confirmPasswordField, gbc);

    gbc.gridy++;
    panel.add(registerButton, gbc);

    add(panel);
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
         
};
