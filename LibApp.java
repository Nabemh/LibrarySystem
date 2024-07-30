import javax.swing.SwingUtilities;

public class LibApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AdvancedSplashScreen splash = new AdvancedSplashScreen();
            splash.setVisible(true);
        });
    }
}
