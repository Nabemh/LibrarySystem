import java.awt.*;
import javax.swing.*;

public class LoginUI extends JFrame {

    LoginUI() {
        login jp = new login();
        add(jp);
    }

//     public static void main(String[] args) {
//         LoginUI f = new LoginUI();
//         f.setVisible(true);
//         f.setSize(600, 350);
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         f.setLocationRelativeTo(null);
//     }
// }

class login extends JPanel {
    ImageIcon back;
    Image bg;

    login() {
        back = new ImageIcon("background.png");
        bg = back.getImage();

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        Font f = new Font("", Font.BOLD, 50);
        Font f1 = new Font("", Font.BOLD, 30);
        Font f2 = new Font("", Font.BOLD, 20);
        Font f3 = new Font("", Font.BOLD, 35);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        add(new JLabel("Library Management System"), gbc);

        gbc.gridy = 1;
        add(new JTextField("Username", 20), gbc);

        gbc.gridy = 2;
        add(new JPasswordField("Password", 20), gbc);

        gbc.gridy = 3;
        add(new JButton("Login"), gbc);

        gbc.gridy = 4;
        add(new JButton("Forgot Password"), gbc);

        gbc.gridy = 5;
        add(new JButton("Register"), gbc);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bg, 0, 0, this);
    }
}
