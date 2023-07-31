package coe318.lab6;

import java.util.ArrayList;

/**
 *
 * @author Reza Aablue
 */
public class Circuit {
    ArrayList<Resistor> resistors = new ArrayList<Resistor>();
    private static Circuit instance = null;
    
    public static Circuit getInstance() {
        if (instance == null) {
            instance = new Circuit();
        }
        return instance;
    }
    
    private Circuit() {
        
    }
    
    void add(Resistor r) {
        resistors.add(r);
        Circuit cir = Circuit.getInstance();
            
    }
    
    @Override
    public String toString() {
        String result = "";
        for (int c=0; c <resistors.size(); c++) {
            result += resistors.get(c) + "\n"; }
        return result;
    }
}