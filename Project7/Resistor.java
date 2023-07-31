package coe318.lab7;

/**
 *
 * @author Reza Aablue
 */
public class Resistor extends Elements {
    //Instance variables.
    public double resistance;
    public int id = 0;
    public static int idNext = 1;
    
    //Constructor: sets up instance variables.
    public Resistor(double rValue, int nodeA, int nodeB) {
        super(nodeA, nodeB);
        
        if (rValue < 0) {
            throw new IllegalArgumentException("The resistance must be greater than or equal to zero.");
        }
        resistance = rValue;
        id = idNext;
        idNext++;
    }

    //A toString method is used to return the resistor as a string.
    //@param r
    @Override
    public String toString() {
        return("R" + id + " " + nodeA + " " + nodeB + " " + resistance);
    }
}