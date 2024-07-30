
import java.awt.*;
import javax.swing.*;


public class Fdemo extends JFrame{
    
    Fdemo(){
        JPdemo jp = new JPdemo();
        add(jp);
    }
}

class JPdemo extends JPanel{
    ImageIcon back;
    Image bg;
    JPdemo(){   
        setLayout(null);
        Font f=new Font("",Font.BOLD, 50);
        Font f1=new Font("",Font.BOLD, 30);
        Font f2=new Font("",Font.BOLD, 20);
        Font f3=new Font("",Font.BOLD, 35);
        back=new ImageIcon("background.png");
        bg=back.getImage();

    //      JPanel mainPanel = new JPanel();
    // mainPanel.setLayout(null); // Use null layout for absolute positioning
    // mainPanel.setPreferredSize(new Dimension(800, 400));
    // mainPanel.setBackground(Color.LIGHT_GRAY);

    // Add logo (placeholder label)
    JLabel logoLabel = new JLabel("Logo Placeholder");
    logoLabel.setBounds(50, 50, 200, 100);
    add(logoLabel);

    // Add username text field
    JTextField usernameField = new JTextField("Username");
    usernameField.setBounds(300, 50, 200, 30);
    add(usernameField);

    // Add password text field
    JPasswordField passwordField = new JPasswordField("Password");
    passwordField.setBounds(300, 100, 200, 30);
    add(passwordField);

    // Add login button
    JButton loginButton = new JButton("Login");
    loginButton.setBounds(300, 150, 200, 30);
    add(loginButton);

    // Add forgot password button
    JButton forgotPasswordButton = new JButton("Forgot Password");
    forgotPasswordButton.setBounds(300, 200, 200, 30);
    add(forgotPasswordButton);

    // Add register button
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
        Fdemo f = new Fdemo();
        f.setVisible(true);
        //f.setBounds(150,20,1300,798);
        f.setSize(600, 350);

    }
}




// public SimpleLoginUI() {
//     // Create a JPanel to hold all components
//     JPanel mainPanel = new JPanel();
//     mainPanel.setLayout(null); // Use null layout for absolute positioning
//     mainPanel.setPreferredSize(new Dimension(800, 400));
//     mainPanel.setBackground(Color.LIGHT_GRAY);

//     // Add logo (placeholder label)
//     JLabel logoLabel = new JLabel("Logo Placeholder");
//     logoLabel.setBounds(50, 50, 200, 100);
//     mainPanel.add(logoLabel);

//     // Add username text field
//     JTextField usernameField = new JTextField("Username");
//     usernameField.setBounds(300, 50, 200, 30);
//     mainPanel.add(usernameField);

//     // Add password text field
//     JPasswordField passwordField = new JPasswordField("Password");
//     passwordField.setBounds(300, 100, 200, 30);
//     mainPanel.add(passwordField);

//     // Add login button
//     JButton loginButton = new JButton("Login");
//     loginButton.setBounds(300, 150, 200, 30);
//     mainPanel.add(loginButton);

//     // Add forgot password button
//     JButton forgotPasswordButton = new JButton("Forgot Password");
//     forgotPasswordButton.setBounds(300, 200, 200, 30);
//     mainPanel.add(forgotPasswordButton);

//     // Add register button
//     JButton registerButton = new JButton("Register");
//     registerButton.setBounds(300, 250, 200, 30);
//     mainPanel.add(registerButton);

//     // Set up the JFrame
//     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     this.setTitle("Simple Login UI");
//     this.add(mainPanel);
//     this.pack();
//     this.setLocationRelativeTo(null); // Center the window on the screen
//     this.setVisible(true);
// }
// }

