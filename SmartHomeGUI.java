import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class SmartHomeGUI {
    private User user;
    private JLabel confirmationLabel;

    public SmartHomeGUI(User user) {
        this.user = user;
        /*
         * Debug Statement
         */
        System.out.println("Initializing Smart Home System...");

        /*
         * Initialise GUI screen
         */
        JFrame frame = new JFrame("Smart Home Automation Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600); // GUI screen size
        frame.setLayout(new BorderLayout()); // Layout style

        /*
         * Create a panel
         */
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        frame.add(mainPanel, BorderLayout.CENTER);

    }
}
