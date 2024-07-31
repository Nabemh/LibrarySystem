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
        setContentPane(backgroundImage);
        backgroundImage.setBounds(0, 0, getWidth(), getHeight());

        
        JLabel title = new JLabel("");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBounds(100, 150, 400, 30); 
        backgroundImage.add(title);

        progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(50, getHeight() - 60, 500, 20);
        progressBar.setStringPainted(true);
        backgroundImage.add(progressBar);

        statusLabel = new JLabel("Loading...");
        statusLabel.setBounds(50, getHeight() - 30, 200, 20);
        backgroundImage.add(statusLabel);

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
                    //dispose();
                    LoginUI f = new LoginUI();
                    f.setVisible(true);
                }
            }
        });
        timer.start();
    }

}
