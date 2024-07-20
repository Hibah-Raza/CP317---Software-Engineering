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
         * Create main panel
         */
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10)); // Add padding
        frame.add(mainPanel, BorderLayout.CENTER);

        /*
         * Create label for last action
         */
        confirmationLabel = new JLabel("No actions yet.");
        confirmationLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(confirmationLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        /*
         * Create Light Control panel
         */
        JPanel lightControlPanel = new JPanel();
        lightControlPanel.setLayout(new BoxLayout(lightControlPanel, BoxLayout.Y_AXIS));
        lightControlPanel.setBorder(BorderFactory.createTitledBorder("Light Control")); // Creates border with text

        /*
         * Create Light Control button
         */
        JButton toggleLightButton = new JButton("Toggle Light");
        toggleLightButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        toggleLightButton.addActionListener(new ActionListener() {
            private boolean lightsOn = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                lightsOn = !lightsOn; // If lights are on, turn off, or vice versa
                user.lightControl(lightsOn);
            }
        });
        lightControlPanel.add(toggleLightButton);

        mainPanel.add(lightControlPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        /*
         * Create Temperature Control panel
         */
        JPanel temperatureControlPanel = new JPanel();
        temperatureControlPanel.setLayout(new BoxLayout(temperatureControlPanel, BoxLayout.Y_AXIS));
        temperatureControlPanel.setBorder(BorderFactory.createTitledBorder("Temperature Control"));

        JLabel tempLabel = new JLabel("Set Temperature:");
        tempLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        temperatureControlPanel.add(tempLabel);

        JSlider temperatureSlider = new JSlider(JSlider.HORIZONTAL, 15, 30, 20);
        temperatureSlider.setMajorTickSpacing(5);
        temperatureSlider.setMinorTickSpacing(1);
        temperatureSlider.setPaintTicks(true);
        temperatureSlider.setPaintLabels(true);
        temperatureControlPanel.add(temperatureSlider);

        JButton setTempButton = new JButton("Confirm Tempature");
        setTempButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        setTempButton.addActionListener(e -> {
            int temperature = temperatureSlider.getValue();
            user.temperatureControl(temperature);
            confirmationLabel.setText("Temperature set to " + temperature + " degrees");
        });
        temperatureControlPanel.add(setTempButton);

        mainPanel.add(temperatureControlPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        frame.setVisible(true);
    }
}
