package coe318.lab7;
import java.util.ArrayList;
/**
 *
 * @author Reza Aablue
 */
public class Circuit {
    // Set up the ArrayList and its instance variable.
    private static Circuit inst = null;
    public ArrayList<Elements> elements = new ArrayList<> ();
    
    private Circuit () {
    }
    
    //This method creates a new circuit if none already exist.
    public static Circuit getInstance() {
        if (inst == null) {
            inst = new Circuit();
        }
        return inst;
    }
    
    //This method adds a voltage source to the ArrayList.
    public void addVoltageSource(VoltageSource v) {
        elements.add(v);
    }
    
    //This method adds a resistor to the ArrayList.
    public void addResistor(Resistor r) {
        elements.add(r);
    }
    
    //The toString method returns the resistor(s)' characteristics for the circuit.
    @Override
    public String toString() {
        String result = "";
        for (int i=0; i<elements.size(); i++) {
            result = result + elements.get(i) + "\n";
        }
        return result;
    }
}