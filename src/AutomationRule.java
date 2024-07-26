/**
 * AutomationRule is a class that contains attributes that every automation has access to, and provides access to these attributes.
 * 
 * <p> Every other automation in this project is a subclass of AutomationRule. An AutomationRule object consists of:
 * 
 * <p> string <code>automationName</code>, which stores the name of the Automation object
 * <p> int[3] <code>automationTime</code>, which stores the Hour, Minute, and Second that an automation is set go off at.
 * 
 * <p> There is no constructor for the AutomationRule class, as it is solely meant to be extended by its subclasses.
 * <p> The AutomationRule defines 2 methods to return its attributers, and defines the runAutomation() method, with
 * the implementation being performed by its subclasses.
 * @author Alianno Tulloch
 */
public class AutomationRule {
    // Int Array holds 3 values: 
    // Hour: (HH) format, number from 0 to 23
    // Minute: (MM) format, number from 0 to 59
    // Seconds: This value will always be set to 0, to ensure consistence with other time values in the project
    protected int automationTime[] = new int [3];

    // Stores the Automation name
    protected String automationName;

    /**
     * Returns the object's designated time value.
     * @return automationTime - The objects time value, displayed in [HH,MM,00] format
     */
    public int[] getAutomationTime() {
        return automationTime;
    }

    /**
     * Returns the object's designated name.
     * @return automationName - The object's designated name
     */
    public String getAutomationName() {
        return automationName;
    }

    /**
     * Defines the <codee>runAutomation()</code> method, without implementation. This method will be
     * implemented in AutomationRule's subclasses
     */
    public void runAutomation(){
        // Remain empty, to be overridden by LightAutomate and TemperatureAutomate subclasses
    }
}