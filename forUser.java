public class forUser {
    
    private String name;
    private SmartHome smartHome;

    public forUser(String name, SmartHome, smartHome){
        this.name = name;
        this.smartHome = smartHome;
    }

    public void lightControl(boolean stat){
        smartHome.lightControl(stat);
    }

    public void thermostatControl(int temp){
        smartHome.thermostatControl(temp);
    }

    public void setAutomation(setAutomation rule){
        smartHome.addAutomation(rule);
    }
}