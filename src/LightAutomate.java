/**
 * LightAutomate is a subclass of the <code>AutomationRule</code> class. This class implements all of 
 * the existing AutomationRule attributes and methods, as well as implements the <code>runAutomation()</code> method.
 * This class also contains the attributes:
 * <p> boolean <code>status</code> - The status (ON/OFF) the automation will set the lights to.
 * <p> LightControl <code>lightControl</code> - The designated <code>LightControl</code> object that will perform the 
 * light updating command.
 * 
 * @author Alianno Tulloch
 */
public class LightAutomate extends AutomationRule {
    // The designated LightControl object that will perform the light updating command
    private LightControl lightControl;
    // The status to set the lights to (ON/OFF)
    private boolean status;

    /**
     * Initializes a LightAutomate object.
     * @param hour - An int between 0 to 23 that represents the hour of the day that the automation is supposed to go off at.
     * @param minute - An int between 0 to 59 that represents the minute of the hour that the automation is supposed to go off at
     * @param name - The name of the automation
     * @param stat - The boolean status (True == ON, False == OFF) to set the light to
     * @param light - The designated LightControl object that will perform the light updating command
     */
    public LightAutomate(int hour, int minute, String name, boolean stat, LightControl light) {
        super.automationTime[0] = hour;
        super.automationTime[1] = minute;
        super.automationTime[2] = 0;
        super.automationName = name;
        this.status = stat;
        this.lightControl = light;
    }

    /**
     * Calls the designated <code>LightControl</code>'s <code>setLightStatus()</code> method, and
     * sends this object's boolean <code>status</code> attribute as the parameter.
     */
    @Override
    public void runAutomation() {
        this.lightControl.setLightStatus(this.status);
    }
}