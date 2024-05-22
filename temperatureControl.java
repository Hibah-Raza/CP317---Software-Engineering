//for Abdul/Rafay to work on

public class TemperatureControl 
{
    private int temperature;

    public TemperatureControl() 
    {
        this.temperature = 20; // Default temperature
    }

    public void temperatureControl(int temp) 
    {
        if (temp < 15 || temp > 30) 
        {
            System.out.println("Temperature is out of range. Please enter a temperature between 15 and 30.");
        } else 
        {
            this.temperature = temp;
            System.out.println("Temperature set to " + temp + " degrees.");
        }
    }

    public int getTemperature() 
    {
        return this.temperature;
    }
}
