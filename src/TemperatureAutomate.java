// Alianno

public class TemperatureAutomate extends AutomationRule {
    private TemperatureControl temperature_Control;
    private int temperature;

    public TemperatureAutomate(int hour, int minute, String name, int temp, TemperatureControl tempCtrl) {
        super.automationTime[0] = hour;
        super.automationTime[1] = minute;
        super.automationTime[2] = 0;
        super.automationName = name;
        this.temperature = temp;
        this.temperature_Control = tempCtrl;
    }

    @Override
    public void runAutomation() {
        this.temperature_Control.setTemperature(this.temperature);
    }
}