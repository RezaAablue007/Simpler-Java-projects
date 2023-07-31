/**
 *
 * @author Reza Aablue
 */
package coe318.lab3;
public class Counter {
    //Instance variables here: number, modulus value and counter left.
    private int number; 
    private int modulusValue;
    private Counter leftSide;
    
    public Counter(int modulus, Counter left) {
    this.number = 0; // Initialize digit to zero.
    this.modulusValue = modulus; //Using the "this" keyword as a reference variable to refer to the current object.
    this.leftSide =  left;
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return this.modulusValue;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return this.leftSide;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return this.number;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        this.number = digit;
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        this.number=this.number+1; //Increment number by 1.
        if (this.number==this.modulusValue) {
            this.number=0;
    
        if (this.leftSide != null) {
            this.leftSide.number=this.leftSide.number+1; 
            // If the counter "rolls over", the left Counter is also incremented, such that it's not nullified.
    }
    
    }
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
    if (this.leftSide == null) {
        return this.number;
    }
    else {
    return (this.number + (this.leftSide.getCount() * this.modulusValue));}
    
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}