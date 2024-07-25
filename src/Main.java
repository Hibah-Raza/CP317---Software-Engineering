import java.util.Date;
import java.util.Calendar;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Smart Home System..."); // Debug statement

        LightControl lightControl = new LightControl();
        TemperatureControl temperatureControl = new TemperatureControl();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date initialDate = calendar.getTime();

        SmartHome smartHome = new SmartHome(lightControl, temperatureControl, initialDate);
        User user = new User("Emad", smartHome);

        // Initialize the GUI on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            try {
                new SmartHomeGUI(user);
                System.out.println("GUI Initialized Successfully."); // Debug statement
            } catch (Exception e) {
                e.printStackTrace(); // Print any exceptions
            }
        });

        System.out.println("Initialization Complete."); // Debug statement
    }
}