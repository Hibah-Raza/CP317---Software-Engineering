// Alianno


public class TemperatureAutomate extends AutomationRule{
    private temperatureControl temperature_Control;
    private int temperature; // change all these to float later maybe?? ask the group members about changing to float

    
    public TemperatureAutomate(int hour, int minute, String name, int temp, temperatureControl tempCtrl) {
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

    @Override
    public void displayAutomation(){
        System.out.println("Automation Name: " + this.automationName);
        System.out.println("Automation Type: Temperature");
        System.out.println("Activation Time: " + this.automationTime[0] + ":" + this.automationTime[1]);
        System.out.println("Set Temperature to: " + this.temperature);
    }

    //SmartHomeSystem()
}