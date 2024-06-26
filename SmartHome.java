//for Alianno to work on
import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
import java.util.Scanner;



/*
-----------------------------------------------------------------------------
- Placeholder description
This class assigns preexisting lightControl, temperatureControl, and AutomationRule
objects to a single smartHome
-----------------------------------------------------------------------------
*/
public class SmartHome {
    private LightControl lightControl;
    private temperatureControl temperature_Control;
    Date delayStart;
    public static int[] currentTime = getCurrentTime();
    private List<AutomationRule> automationList;



    //NESTED CLASS - This class constantly updates the internal time of the SmartHome, and checks if the time matches any automations
    private class SmartHomeTimeUpdater extends TimerTask {
        //Calendar delayStart = Calendar.getInstance();
        //delayStart.get();
        //delayStart.set(Calendar.SECOND, 0);
        @Override
        public void run(){
            // TEST TO SEE IF THIS TIMER STUFF ACTUALLY WORKS
            currentTime = getCurrentTime();

            //Test - Will the code update on its own (yes)
            //System.out.println(currentTime[0] + ":" + currentTime[1]);
            for (AutomationRule j : automationList){
                // If the automation is turned on, and if the automation is set to activate at the current time, then run the automation
                if (j.active == true && j.automationTime[0] == currentTime[0] && j.automationTime[1] == currentTime[1]) {
                    j.runAutomation();
                }
            }
            //System.out.println("Automation is Running (TEST)");
        }
    }   



    public static int[] getCurrentTime(){
        int currentTime[] = new int[3];
        currentTime[0] = LocalTime.now().getHour();
        currentTime[1] = LocalTime.now().getMinute();
        currentTime[2] = 0;
        return currentTime;
    }


    /*
    -----------------------------------------------------------------------------
    Assigns lightControl and temperatureControl objects to the SmartHome object
    -----------------------------------------------------------------------------
    parameters: lightControl, temperatureControl
    -----------------------------------------------------------------------------
    */
    public SmartHome(LightControl lightCtrl, temperatureControl temperatureCtrl, Date initialDate) {
        this.lightControl = lightCtrl;
        this.temperature_Control = temperatureCtrl;
        // I think because Smart Home doesnt directly interact with the computer (only Main does), it won't let me use all of the
        // Calendar commands, so in the Main file, I initiliazed the initial date using
        /*  Calendar test6_1 = Calendar.getInstance();
            test6_1.set(Calendar.SECOND, 0);
            test6_1.set(Calendar.MILLISECOND, 0);
         */
        // This sets seconds and millisecond to 0 so the internal timer should update itself on the first second of every minute
        this.delayStart = initialDate;
        this.automationList = new ArrayList<>();
        Timer updateTime = new Timer("Update time, update auto");
        // set SmartHome's internal clock to start run beginning on the date/hour/minute initialized
        // and the clock will update itself every minute
        updateTime.scheduleAtFixedRate(new SmartHomeTimeUpdater(), delayStart, 60000);
    }
    
    /*
    -----------------------------------------------------------------------------
    Controls the status of the light object
    -----------------------------------------------------------------------------
    parameters: boolean status - the status value to send the lightControl object
                                    - true = on, false = off
    -----------------------------------------------------------------------------
    */
    public void lightControl(boolean status) {
        this.lightControl.setLightStatus(status);
    }

    /*
    -----------------------------------------------------------------------------
    Controls the temperature of the thermostat
    -----------------------------------------------------------------------------
    parameters: int temp - the temperature to send to the thermostat object
    -----------------------------------------------------------------------------
    */
    public void temperatureControl (int temp) {
        this.temperature_Control.setTemperature(temp);
    }
    



    /*
    -----------------------------------------------------------------------------
    Adds automations to an ArrayList of automations, the automations can decide to run on their own, 
    this just organizes them together somewhere that the Smart Home can access them.
    -----------------------------------------------------------------------------
    parameters: rule - any automation that falls under the AutomationRule class or subclasses
    -----------------------------------------------------------------------------
    */
    public void addAutomationRule (AutomationRule auto) {
        this.automationList.add(auto);
    }


    // CHECK IF THIS WORKS - IT DOES
    public void displayAutomationList () {
        int count = 1;
        for (AutomationRule i : this.automationList) {
            System.out.println(count + ":");
            i.displayAutomation();
            System.out.println();
        }
    }


    // POLYMORPHISM - Creates LightAutomation and adds it to the automation List
    public void createAutomation (int hour, int minute, String name, boolean stat, LightControl light) {
        LightAutomate newLightAutomation = new LightAutomate(hour, minute, name, stat, light);
        addAutomationRule(newLightAutomation);
    }

    // POLYMORPHISM - Creates Thermostat Automation and adds it to the automation list
    public void createAutomation (int hour, int minute, String name, int temp, temperatureControl tempCtrl) {
        TemperatureAutomate newTemperatureAutomation = new TemperatureAutomate(hour, minute, name, temp, tempCtrl);
        addAutomationRule(newTemperatureAutomation);
    }

    /* FINISH LATER
    public void editAutomation(AutomationRule rule) {


    }
    */

    public void deleteAutomation(AutomationRule rule) {
        this.automationList.remove(rule);
        rule = null;
    }



// Unsure if this needs to go in smart home or in the main/gui
/*
    public void AutomationListMenu() {
        this.displayAutomationList();
        Scanner menuInput = new Scanner(System.in);
        // Can change code and remove the print statements once I see the GUI, this is just a basic written display
        System.out.println("AutomationListMenu: ");
        System.out.println("1. Create new Automation");
        System.out.println("2. Edit Automation");
        System.out.println("3. Delete Automation");
        System.out.println("4. Exit Automation Menu");
        int choice = menuInput.nextInt();

        switch(choice){
            // Create new automation (copypaste from main)
            case 1:



            break;

            // Edit automation (create inner switch case statement)
            case 2:
                System.out.println("Enter");
                choice = menuInput.nextInt();

                switch(choice){

                }

            break;

            // Delete automation
            case 3:
                //delete goes here, make delete automation method in automation rule
            break;


            case 4:
                //return;
            break;
        }
    }
    */

}