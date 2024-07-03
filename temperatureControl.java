//for Abdul/Rafay to work on

// This is the class definition for the temperature control system
public class TemperatureControl {
    // This is a private instance variable to store the current temperature
    private int temperature;

    // This is the constructor for the class, which is called when a new object is
    // created
    public TemperatureControl() 
    {
        // Setting the default temperature to 20 degrees
        this.temperature = 20; // Default temperature
    }

    // This method allows the temperature to be set
    public void setTemperature(int temp) {
        // Check if the temperature is within the valid range (between 15 and 30)
        if (temp < 15 || temp > 30) {
            // If the temperature is out of range, print an error message
            System.out.println("Temperature is out of range. Please enter a temperature between 15 and 30.");
        } else {
            // If the temperature is within range, set it and print a confirmation message
            this.temperature = temp;
            System.out.println("Temperature set to " + temp + " degrees.");
        }
    }

    // This method allows the current temperature to be retrieved
    public int getTemperature() {
        // Return the current temperature
        return this.temperature;
    }
}