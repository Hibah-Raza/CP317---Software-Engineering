import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SmartHomeGUI {
    public SmartHomeGUI(User user) {
        /*
         * Debug Statement
         */
        System.out.println("Initializing Smart Home System...");

        /*
         * Initialise GUI screen
         */
        JFrame frame = new JFrame("Smart Home Automation Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
    }
}
