// Alianno

public class LightAutomate extends AutomationRule {
    private LightControl lightControl;
    private boolean status;

    public LightAutomate(int hour, int minute, String name, boolean stat, LightControl light) {
        super.automationTime[0] = hour;
        super.automationTime[1] = minute;
        super.automationTime[2] = 0;
        super.automationName = name;
        super.active = true;
        this.status = stat;
        this.lightControl = light;
    }

    @Override
    public void runAutomation() {
        this.lightControl.setLightStatus(this.status);
    }

    @Override
    public void displayAutomation() {
        System.out.println("Automation Name: " + this.automationName);
        System.out.println("Automation Type: Light");
        System.out.println("Activation Time: " + this.automationTime[0] + ":" + this.automationTime[1]);
        System.out.println("Set Light to: " + this.status);
    }

    public LightControl getLightControl() {
        return lightControl;
    }

    public void setLightControl(LightControl lightControl) {
        this.lightControl = lightControl;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // SmartHomeSystem()
}