//for Alianno to work on
import java.util.ArrayList;
import java.util.List;

"""
-----------------------------------------------------------------------------
- Placeholder description
This class assigns preexisting lightControl, temperatureControl, and automationRule
objects to a single smartHome
-----------------------------------------------------------------------------
"""
public class SmartHome {
    LightControl lightControl = new LightControl();
    temperatureControl tempControl = new temperatureControl();
    // add automation

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
        // Add automation rule 
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

    //   do in the morning
    //   """ 
    //   -----------------------------------------------------------------------------
    
    //   -----------------------------------------------------------------------------
    //   parameters: 
    //   -----------------------------------------------------------------------------
    //   """
    //   public void addAutomation {

    //   }
}





