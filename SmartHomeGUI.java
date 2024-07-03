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

        /*
         * Create a Toggle Light button
         */
        JButton toggleLightButton = new JButton("Toggle Light");
        toggleLightButton.addActionListener(new ActionListener() {
            private boolean lightsOn = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                lightsOn = !lightsOn;
                user.lightControl(lightsOn);
            }
        });

        /*
         * Positioning for Toggle Light button
         */
        gbc.gridx = 0; // Position in first column
        gbc.gridy = 0; // Position in first row
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(toggleLightButton, gbc); // Add buttong to GUI with these constraints
    }
}
