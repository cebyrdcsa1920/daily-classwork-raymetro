import java.awt.Color;

public class Car
{
    private String model;
    private Color color;
    private int numPassengers;
    private double amountOfGas;
    private final double mpg;

    public Car()
    {
        model = "Mustang";
        color = Color.YELLOW;
        numPassengers = 2;
        amountOfGas = 12.5;
        mpg = 15.0;
    }

    public Car(String model, Color color, int numPassengers, double amountOfGas, double mpg)
    {
        this.model = model;
        this.color = color;
        this.numPassengers = numPassengers;
        this.amountOfGas = amountOfGas;
        this.mpg = mpg;
    }
    /**
     *Drives the car given distance. Subtracts gas from the tank
     *
     *@param distance. The distance driven in miles
     */
    public void drive(double distance)
    {
        amountOfGas -= distance / mpg;
    }

   /**
    *amount of gas in tank
    *
    * @return amount of gas
    */
    public double getamountOfGas()
    {
        return amountOfGas;
    }

    /**
     * Fills up the gas tank
     *
     * @param amount of gas to add tank
     */
     public void fillupGasTank(double amount)
     {
         amountofGas += amount;
     }
    public String toString()
    {

    }
