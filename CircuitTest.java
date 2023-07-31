package coe318.lab6;

/**
 *
 * @author Reza Aablue
 */
public class CircuitTest {
    public static void main(String[] args) {
        Node nodes[] = new Node[10];
        
        for(int c=0; c < nodes.length; c++) {
            nodes[c] = new Node();
        }
    Resistor r1 = new Resistor(20, nodes[1], nodes[3]);
    Resistor r2 = new Resistor(40, nodes[4], nodes[6]);
    
    System.out.println("\nResistor Information: ");
    System.out.println(r1);
    System.out.println(r2);
    
    Circuit cir = Circuit.getInstance();
    
    cir.add(r1);
    cir.add(r2);
    
    System.out.println("\nCircuit Information: ");
    System.out.println(cir);
    }
}