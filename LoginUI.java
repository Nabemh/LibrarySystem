
import java.awt.*;
import javax.swing.*;


public class LoginUI extends JFrame{
    
    LoginUI(){
        Login jp = new Login();
        add(jp);
    }
}

class Login extends JPanel{
    ImageIcon back;
    Image bg;
    Login(){   
        setLayout(null);
        back=new ImageIcon("background.png");
        bg=back.getImage();

    JLabel logoLabel = new JLabel("");
    logoLabel.setBounds(50, 50, 200, 100);
    add(logoLabel);

    JTextField usernameField = new JTextField("Username");
    usernameField.setBounds(300, 50, 200, 30);
    add(usernameField);

    JPasswordField passwordField = new JPasswordField("Password");
    passwordField.setBounds(300, 100, 200, 30);
    add(passwordField);

    JButton loginButton = new JButton("Login");
    loginButton.setBounds(300, 150, 200, 30);
    add(loginButton);

    JButton forgotPasswordButton = new JButton("Forgot Password");
    forgotPasswordButton.setBounds(300, 200, 200, 30);
    add(forgotPasswordButton);

    JButton registerButton = new JButton("Register");
    registerButton.setBounds(300, 250, 200, 30);
    add(registerButton);

    }

    public void paintComponent (Graphics g){
        g.drawImage(bg, 0, 0, this);
    }
}

class login {
    public static void main(String[] args) {
        LoginUI f = new LoginUI();
        f.setVisible(true);
        //f.setBounds(150,20,1300,798);
        f.setSize(600, 350);

    }
}

