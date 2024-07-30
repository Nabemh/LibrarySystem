import java.awt.*;
import javax.swing.*;

public class LoginUI extends JFrame {

    LoginUI() {
        login jp = new login();
        add(jp);
    }

}

class login extends JPanel {
    ImageIcon back;
    Image bg;

    login() {
        back = new ImageIcon("background.png");
        bg = back.getImage();

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        add(new JLabel("Library Management System"), gbc);

        gbc.gridy = 1;
        add(new JTextField("Username", 20), gbc);

        gbc.gridy = 2;
        add(new JPasswordField("Password", 20), gbc);

        gbc.gridy = 3;
        JButton loginButton = new JButton("Login");
        add(loginButton, gbc);

        loginButton.addActionListener(e ->{
            new LibraryManagement();
        });


        gbc.gridy = 4;
        add(new JButton("Forgot Password"), gbc);

        JButton registerButton = new JButton("Register");
        gbc.gridy = 5;
        add(registerButton, gbc);

        registerButton.addActionListener(e -> {
            RegistrationFrame registrationFrame = new RegistrationFrame();
            registrationFrame.setVisible(true);
            SwingUtilities.getWindowAncestor(this).dispose();
    });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bg, 0, 0, this);
    }
}
