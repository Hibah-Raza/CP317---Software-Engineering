/**
 * TemperatureAutomate is a subclass of the <code>AutomationRule</code> class. This class implements all of 
 * the existing AutomationRule attributes and methods, as well as implements the <code>runAutomation()</code> method.
 * This class also contains the attributes:
 * <p> int <code>temperature</code> - The temperature the automation will set the thermostat to.
 * <p> TemperatureControl <code>temperature_Control</code> - The designated <code>TemperatureControl</code> object that will perform the 
 * temperature updating command.
 * 
 * @author Alianno Tulloch
 */
public class TemperatureAutomate extends AutomationRule {
    // The designated TemperatureControl object that will perform the temperature updating command
    private TemperatureControl temperature_Control;
    // The temperature the automation will set the thermostat to
    private int temperature;

    /**
     * Initializes a TemperatureAutomate object.
     * @param hour - An int between 0 to 23 that represents the hour of the day that the automation is supposed to go off at.
     * @param minute - An int between 0 to 59 that represents the minute of the hour that the automation is supposed to go off at
     * @param name - The name of the automation
     * @param temp - The temperature to set the thermostat to
     * @param tempCtrl - The designated TemperatureControl object that will perform the temperature updating command
     */
    public TemperatureAutomate(int hour, int minute, String name, int temp, TemperatureControl tempCtrl) {
        super.automationTime[0] = hour;
        super.automationTime[1] = minute;
        super.automationTime[2] = 0;
        super.automationName = name;
        this.temperature = temp;
        this.temperature_Control = tempCtrl;
    }

    /**
     * Calls the designated <code>TemperatureControl</code>'s <code>setTemperature()</code> method, and
     * sends this object's int <code>temperature</code> attribute as the parameter.
     */
    @Override
    public void runAutomation() {
        this.temperature_Control.setTemperature(this.temperature);
    }
}