// Alianno

public class TemperatureAutomate extends AutomationRule {
    private TemperatureControl temperature_Control;
    private int temperature;

    public TemperatureAutomate(int hour, int minute, String name, int temp, TemperatureControl tempCtrl) {
        super.automationTime[0] = hour;
        super.automationTime[1] = minute;
        super.automationTime[2] = 0;
        super.automationName = name;
        super.active = true;
        this.temperature = temp;
        this.temperature_Control = tempCtrl;
    }

    @Override
    public void runAutomation() {
        this.temperature_Control.setTemperature(this.temperature);
    }

    @Override
    public void displayAutomation() {
        System.out.println("Automation Name: " + this.automationName);
        System.out.println("Automation Type: Temperature");
        System.out.println("Activation Time: " + this.automationTime[0] + ":" + this.automationTime[1]);
        System.out.println("Set Temperature to: " + this.temperature);
    }

    public TemperatureControl getTemperature_Control() {
        return temperature_Control;
    }

    public void setTemperature_Control(TemperatureControl temperature_Control) {
        this.temperature_Control = temperature_Control;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    // SmartHomeSystem()
}