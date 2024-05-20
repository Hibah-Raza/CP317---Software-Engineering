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