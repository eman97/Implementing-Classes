
/**
 * Write a description of class Balloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balloon_P3
{
    // instance variables - replace the example below with your own
    private double radius;

    /**
     * Constructor for objects of class Balloon
     */
    public Balloon_P3()
    {
        // initialise instance variables radius
        radius = 0;
    }

    public void inflate(double amount)
    {
        radius=radius+amount;
    }
    
    public double getVolume()
    {
        double volume=(4/3)*(Math.PI)*radius*radius*radius;
        return volume;
    }
}
