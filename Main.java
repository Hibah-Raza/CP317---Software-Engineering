//for Hibah (me) to work on

/*import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        LightControl lightControl = new LightControl();
        TemperatureControl temperatureControl = new TemperatureControl();
        SmartHome smartHome = new SmartHome(lightControl, temperatureControl);
        User User = new User("Emad", smartHome);

        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("Control Lights");
            System.out.println("Control Temperature");
            System.out.println("Set Automation");
            System.out.println("Exit");

            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Light Status (true = on, false = off): ");
                    boolean stat = scanner.nextBoolean();
                    User.lightControl(stat);
                break;
                case 2:
                    System.out.print("Enter temperature: ");
                    int temperature = scanner.nextInt();
                    User.temperatureControl(temperature);
                break;
                case 3:
                    System.out.print("Enter the hour for automation: ");
                    int hour = scanner.nextInt();
                    System.out.print("Enter your light status for automation (true = on, false = off): ");
                    boolean autoStatus = scanner.nextBoolean();
                    User.setAutomationRule(new TimeBased(hour, stat));
                    smartHome.applyAutomationRule();
                break;
                case 4:
                    scanner.close();
                    System.exit(0);
                break;
                
                default:
                    System.out.println("Invalid choice");

            }
        }

    }
}*/

//---Main that fits the GUI-----

/*import java.util.Date;
import java.util.Calendar;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Smart Home System..."); // Debug statement

        lightControl lightControl = new lightControl();
        temperatureControl temperatureControl = new temperatureControl();
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
}*/