package coe318.lab7;

/**
 *
 * @author Reza Aablue
 */
public class VoltageSource extends Elements {
    //Instance variables
    public double voltage;
    public int id = 0;
    public static int idNext = 1;
    
    //Constructor: sets up instance variables.
    public VoltageSource (double voltageValue, int nodeA, int nodeB) {
        super(nodeA, nodeB);
        if (voltageValue == 0) {
            throw new IllegalArgumentException("The voltage value cannot be zero!");
        }
        voltage = voltageValue;
        id = idNext;
        idNext++;
    }
    
    //A toString method is used to return the VoltageSource as a string.
    //@param r
    @Override
    public String toString() {
        if (voltage > 0) {
            return ("V" + id + " " + nodeA + " " + nodeB + " DC " + voltage);
        }
        else {
            return ("V" + id + " " + nodeB + " " + nodeA + " DC " + voltage);
        }
    }
}