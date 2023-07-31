package coe318.lab7;

/**
 *
 * @author Reza Aablue
 */
public class Elements {
    public int nodeA;
    public int nodeB;
    public Elements element;
    public String elementType;
    
    //Constructor which sets up the 2 nodes where the element is located.
    //@param node1
    //@param node2
    public Elements(int node1, int node2) {
        nodeA = node1;
        nodeB = node2;        
    }
    
    public int[] getNodes() {
        int[] nodes = {nodeA, nodeB};
        return nodes;
    }
}