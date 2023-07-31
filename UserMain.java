package coe318.lab7;
import java.util.Scanner;
/**
 *
 * @author Reza Aablue
 */
public class UserMain {
    
    public static void main(String args[]) {
        //This method is used to scan the input.
        Scanner input = new Scanner(System.in);
        String element = "", inputs[] = new String[4], inp;
        int nA = 0, nB = 0;
        double value;
        Circuit c = Circuit.getInstance();
        
        do {
            System.out.println("Enter an element: ");
            inp = input.nextLine();
            inputs = inp.split(" ");
            
            if (inputs[0].equals("end")) {
                break;
            }
            
            else if(inputs[0].equals("spice")) {
                System.out.println("\n" + c);
                continue;
            }
            
            element = inputs[0];
            nA = Integer.parseInt(inputs[1]);
            nB = Integer.parseInt(inputs[2]);
            value = Double.parseDouble(inputs[3]);
            
            if (element.equals("v")) {
                VoltageSource volts = new VoltageSource(value, nA, nB);
                c.addVoltageSource(volts);
            }
        
            else if (element.equals("r")) {
                Resistor resist = new Resistor(value, nA, nB);
                c.addResistor(resist);
            }
        } while(!(element.equals("end")));
        
        if (inp.equals("end")) {
            System.out.println("\n" + "All done!");
        }
    }
}