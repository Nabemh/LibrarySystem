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

        // Load and set the background image
        JLabel backgroundImage = new JLabel(new ImageIcon("background.jpeg"));
        backgroundImage.setLayout(null);
        setContentPane(backgroundImage);
        backgroundImage.setBounds(0, 0, getWidth(), getHeight());

        // Create and position the title label
        JLabel title = new JLabel("");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBounds(100, 150, 400, 30); // Adjusted position
        backgroundImage.add(title);

        // Create and position the progress bar at the bottom
        progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(50, getHeight() - 60, 500, 20); // Positioned at the bottom
        progressBar.setStringPainted(true);
        backgroundImage.add(progressBar);

        // Create and position the status label at the bottom
        statusLabel = new JLabel("Loading...");
        statusLabel.setBounds(50, getHeight() - 30, 200, 20); // Positioned just above the progress bar
        backgroundImage.add(statusLabel);

        // Ensure layout is null to manually set bounds
        setLayout(null);

        // Timer to simulate loading progress
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
                    new LoginUI(); 
                }
            }
        });
        timer.start();
    }

}
