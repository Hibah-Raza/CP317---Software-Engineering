// Alianno

public class LightAutomate extends AutomationRule {
    private LightControl lightControl;
    private boolean status;

    public LightAutomate(int hour, int minute, String name, boolean stat, LightControl light) {
        super.automationTime[0] = hour;
        super.automationTime[1] = minute;
        super.automationTime[2] = 0;
        super.automationName = name;
        this.status = stat;
        this.lightControl = light;
    }

    @Override
    public void runAutomation() {
        this.lightControl.setLightStatus(this.status);
    }
}