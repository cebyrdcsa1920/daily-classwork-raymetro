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

    /**
     *Drives the car given distance. Subtracts gas from the tank
     *
     *@param distance. The distance driven in miles
     */
    public void drive(double distance)
    {
        amountOfgas -= distance / mpg;
    }

   /**
    *
    *@return amount off gas
    */
    public double getamounOfgas()
    {
        return amountOfgas
    }
    public String toString()
    {

    }
