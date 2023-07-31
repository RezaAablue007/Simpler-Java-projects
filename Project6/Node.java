package coe318.lab6;

/**
 *
 * @author Reza Aablue
 */
public class Node {
    int nodeNumber;
    static int counter;
    
    Node() {
        nodeNumber = counter++;
    }
    
    @Override
    public String toString() {
        return nodeNumber+" ";
    }
}