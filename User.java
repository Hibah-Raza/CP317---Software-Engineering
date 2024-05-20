/*
"""
-----------------------------------------------------------------------------
This class (forUser) represents the user in the Smart Home Automation System.
It will allow our user to be able to control the lights + the temp settings as
well as be able to set automation rules through the app.
-----------------------------------------------------------------------------
"""
*/
public class User { //Open class

    private String name; //Name of the user
    private SmartHome smartHome; //SHAS (Smart Home Automation System) assigned to user

    /*
    """
    -----------------------------------------------
    Constructing a forUser object that is specified 
    with the user's name and Smart Home System.
    -----------------------------------------------
    parameters: name, smartHome
    -----------------------------------------------
    """
     */
    public User(String name, SmartHome smartHome) { //Open forUser
        this.name = name;
        this.smartHome = smartHome;
        
    } //Close forUser

    /*
    """
    -----------------------------------------------
    Will control the lights through the Smart Home
    System, for turning on and off.
    -----------------------------------------------
    parameters: stat - true = on/false = off
    -----------------------------------------------
    """
     */
    public void lightControl(boolean stat) { //Open lightControl
        smartHome.lightControl(stat);

    } //Close lightControl

    /*
    """
    -----------------------------------------------
    Will control the temperature through the Smart
    Home System, for high or low temperature.
    -----------------------------------------------
    parameters: temp - what temperature is set to
    -----------------------------------------------
    """
     */
    public void temperatureControl(int temp) { //Open temperatureControl
        smartHome.temperatureControl(temp);

    } //Close temperatureControl

    /*
    """
    -----------------------------------------------
    Will set an rule for automation through the
    Smart Home System, for automation part of SHAS
    -----------------------------------------------
    parameters: rule
    -----------------------------------------------
    """
    */
    public void setAutomationRule(AutomationRule rule) { //Open setAutomationRule
        smartHome.addAutomationRule(rule);

    } //Close setAutomation

} //Close class 