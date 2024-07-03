//for Aarez to work on (yay ^.^)

/*
-----------------------------------------------------------------------------
This class represents the Light Control System in the Smart Home Automation
System. It allows the user to control the lights by turning them on or off
and to check the current status of the lights.
-----------------------------------------------------------------------------
*/

public class LightControl {
    private boolean status;

    public void setLightStatus(boolean status) {
        this.status = status;
        System.out.println("Light is now " + (status ? "ON" : "OFF"));
    }

    public boolean getLightStatus() {
        return status;
    }
}
