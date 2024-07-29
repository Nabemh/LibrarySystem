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
        setLayout(new FlowLayout());
        
        
        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameField = new JTextField(10);

        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameField = new JTextField(10);

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(10);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(10);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField(10);

        registerButton = new JButton("Register");

        JPanel panel = new JPanel();
panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

panel.add(firstNameLabel);
panel.add(firstNameField);
panel.add(lastNameLabel);
panel.add(lastNameField);
panel.add(usernameLabel);
panel.add(usernameField);
panel.add(passwordLabel);
panel.add(passwordField);
panel.add(confirmPasswordLabel);
panel.add(confirmPasswordField);
panel.add(registerButton);

add(panel, BorderLayout.CENTER);
           
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

     setSize(300, 200);
     setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistrationFrame();
            }
        });

    }     
};
