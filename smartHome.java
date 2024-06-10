//for Alianno to work on
import java.util.ArrayList;
import java.util.List;

"""
-----------------------------------------------------------------------------
- Placeholder description
This class assigns preexisting lightControl, temperatureControl, and AutomationRule
objects to a single smartHome
-----------------------------------------------------------------------------
"""
public class SmartHome {
    private LightControl lightControl = new LightControl();
    private temperatureControl tempControl = new temperatureControl();
    private List<AutomationRule> automationList;

    """
    -----------------------------------------------------------------------------
    Assigns lightControl and temperatureControl objects to the SmartHome object
    -----------------------------------------------------------------------------
    parameters: lightControl, temperatureControl
    -----------------------------------------------------------------------------
    """
    public SmartHome(LightControl lightControl, temperatureControl tempControl) {
        this.lightControl = lightControl;
        this.temperatureControl = tempControl;
        this.automationList = new ArrayList<>();
    }
    
    """
    -----------------------------------------------------------------------------
    Controls the status of the light object
    -----------------------------------------------------------------------------
    parameters: boolean status - the status value to send the lightControl object
                                    - true = on, false = off
    -----------------------------------------------------------------------------
    """
    public void lightControl(boolean status) {
        this.lightControl.setLightStatus(status);
    }

    """
    -----------------------------------------------------------------------------
    Controls the temperature of the thermostat
    -----------------------------------------------------------------------------
    parameters: int temp - the temperature to send to the thermostat object
    -----------------------------------------------------------------------------
    """
    public void thermostatControl (int temp) {
        this.temperatureControl.setTemperature(temp );
    }


    


    """ 
    -----------------------------------------------------------------------------
    Adds automations to an ArrayList of automations, the automations can decide to run on their own, 
    this just organizes them together somewhere that the Smart Home can access them.
    -----------------------------------------------------------------------------
    parameters: rule - any automation that falls under the AutomationRule class or subclasses
    -----------------------------------------------------------------------------
    """
    public void addAutomationRule (AutomationRule auto) {
        automationList.add(auto);
    }


    // CHECK IF THIS WORKS
    public void displayAutomationList () {
        for (int i : this.automationList()) {
            i.displayAutomation();
        }
    }
}





