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
         * Create and position Toggle Light button
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

        gbc.gridx = 0; // Position in first column
        gbc.gridy = 0; // Position in first row
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(toggleLightButton, gbc); // Add buttong to GUI with these constraints

        /*
         * Create and position label that says "Set Temperature"
         */
        JLabel tempLabel = new JLabel("Set Temperature:");

        gbc.gridx = 0; // Position in first column
        gbc.gridy = 1; // Position in second row
        frame.add(tempLabel, gbc); // Add label to GUI with these constraints

        /*
         * Create and position temperature slider
         */
        JSlider temperatureSlider = new JSlider(JSlider.HORIZONTAL, 15, 30, 20);
        temperatureSlider.setMajorTickSpacing(5); // Set big ticks for every 5 numbers
        temperatureSlider.setMinorTickSpacing(1); // Set small ticks for every number
        temperatureSlider.setPaintTicks(true); // Show the tick marks on the slider
        temperatureSlider.setPaintLabels(true); // Show the labels on the slider

        gbc.gridx = 0; // Position in first column
        gbc.gridy = 2; // Position in third row
        frame.add(temperatureSlider, gbc); // Add slider to GUI with these constraints

        /*
         * Create and position set temperature button
         */
        JButton setTempButton = new JButton("Set Temperature");
        setTempButton.addActionListener(e -> {
            int temperature = temperatureSlider.getValue(); // Get value from slider
            user.temperatureControl(temperature); // Set temperature
        });

        gbc.gridx = 0; // Position in first column
        gbc.gridy = 3; // Position in fourth row
        frame.add(setTempButton, gbc);
    }
}
