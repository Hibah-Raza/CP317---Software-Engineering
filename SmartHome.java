//for Alianno to work on
import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Calendar;
import java.util.Date;



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
                if (j.automationTime[0] == currentTime[0] && j.automationTime[1] == currentTime[1]) {
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
        this.delayStart = initialDate;
        this.automationList = new ArrayList<>();
        Timer updateTime = new Timer("Update time, update auto");
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


    // CHECK IF THIS WORKS
    public void displayAutomationList () {
        for (AutomationRule i : this.automationList) {
            i.displayAutomation();
            System.out.println();
        }
    }


    //private void runAutomation(){
    //}

}