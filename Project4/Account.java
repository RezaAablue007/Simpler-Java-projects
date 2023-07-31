package coe318.lab4;

/**
 *
 * @author Reza Aablue
 */
public class Account {
    private String name;
    private double balance;
    private int number;
        
public Account (String name, int number,double balance) {
    this.name = name;
    this.number = number;
    this.balance = balance;        
}
    
// Getters and Setters.

public String getName() {
    return name;
}

public double getBalance() {
    return balance;
}
    
public int getNumber() {
    return number;
}
    
boolean deposit(double amount) {
    //A deposit can fail if the amount is negative or zero.
    if (amount <= 0.0) {
        return false;
    }
    else {
        balance+=amount;
    }
    return true;
}
    
boolean withdraw(double amount) {
    /*An attempt to withdraw can fail if the balance is 
    not big enough or if an attempt is made to withdraw zero or a negative calue. */
    if (balance < amount || amount <= 0.0) {
        return false;
    }
    else {
        balance=balance-amount;
    }
    return true;
}
    
    public static void main (String [] args) {
        //The main method.
        Account alice = new Account ("Alice Jones", 001, 500.75);
        System.out.println(alice.name);
        System.out.println("Account Number: "+alice.number);
        System.out.println("Current Account Balance: "+alice.balance);
    }
    @Override
    public String toString() {
        //DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " +String.format("$%.2f", getBalance()) + ")";
    }
}