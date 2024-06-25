// for Alianno to work on

import java.time.LocalTime;



// Automation super class - every automation subclass extends this base class, which stores the time variable,
// and has a command method that can be overridden by the 2 sublcasses
public class AutomationRule {
    // Both to be compared with the current LocalTime value
    protected int automationTime[] = new int [3];// Array holds 3 values: Hour (HH), Minute (MM), and Millisecond (which will always be set to 0)
    

    protected String automationName; // Stores the Automation name
    // Stores it in the superclass just because - maybe change this?

    // UPDATE: MOVING THIS TO SMART HOME
    /*public static int[] getCurrentTime(){
        int currentTime[] = new int[3];
        currentTime[0] = LocalTime.now().getHour();
        currentTime[1] = LocalTime.now().getMinute();
        currentTime[2] = 0;
        return currentTime;
    } 
        
    
    
    
    //public void command();
    public void command (AutomationRule auto){
        if (automationTime  == getCurrentTime()) {
            auto.runAutomation();
        }
    }*/



    //public void command();
    public void command (AutomationRule auto){
        if (automationTime  == SmartHome.getCurrentTime()) {
            auto.runAutomation();
        }
    }



    public void runAutomation(){
        // Remain empty, to be overridden by LightAutomate and TemperatureAutomate subclasses
    }

    public void displayAutomation(){
        // Remain empty, to be overridden by LightAutomate and TemperatureAutomate subclasses
    }

}