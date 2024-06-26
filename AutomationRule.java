// for Alianno to work on


// maybe ask if i can add a "Turn Thermostat off" setting to the Thermostat, probably need to add private boolean status like light has


// Automation super class - every automation subclass extends this base class, which stores the time variable,
// and has a command method that can be overridden by the 2 sublcasses
public class AutomationRule {
    // Both to be compared with the current LocalTime value
    protected int automationTime[] = new int [3];// Array holds 3 values: Hour (HH), Minute (MM), and Millisecond (which will always be set to 0)
    


    protected String automationName; // Stores the Automation name
    // Stores it in the superclass just because - maybe change this?

    // Boolean that determines whether the automation is active and should be executed
    public boolean active;


    // Updates the active boolean to match the change value
    public void updateActive(boolean change){
        if (this.active != change)
            this.active = change;
    }


    public void runAutomation(){
        // Remain empty, to be overridden by LightAutomate and TemperatureAutomate subclasses
    }

    public void displayAutomation(){
        // Remain empty, to be overridden by LightAutomate and TemperatureAutomate subclasses
    }

}