import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdvancedSplashScreen extends JWindow {

    private JProgressBar progressBar;
    private JLabel statusLabel;

    public AdvancedSplashScreen() {
        
        setSize(600, 500);
        setLocationRelativeTo(null);


         
        JLabel backgroundImage = new JLabel(new ImageIcon("background.jpeg"));
        backgroundImage.setLayout(null);
        add(backgroundImage, 0);
        backgroundImage.setBounds(0, 0, getWidth(), getHeight());
        getContentPane().setBackground(Color.WHITE);


        JLabel title = new JLabel("Library Management System");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBounds(120, 160, 250, 30);
        add(title);


        progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(50, 200, 300, 20);
        progressBar.setStringPainted(true);
        add(progressBar);

        statusLabel = new JLabel("Loading...");
        statusLabel.setBounds(50, 220, 200, 20);
        add(statusLabel);

        setLayout(null);

        Timer timer = new Timer(100, new ActionListener() {
            int count = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                progressBar.setValue(count);
                statusLabel.setText("Loading... (" + count + "%)");

                if (count >= 100) {
                    ((Timer) e.getSource()).stop();
                    dispose();
                    new LibraryManagement();  // add  login page here
                }
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AdvancedSplashScreen splash = new AdvancedSplashScreen();
            splash.setVisible(true);
        });
    }
}

