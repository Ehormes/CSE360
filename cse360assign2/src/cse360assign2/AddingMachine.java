package cse360assign2;

/**
 * @author Edmone Hermiz
 * ID: 1207447679
 * Assignment 2
 * 
 * A simple calculator application
 * 
 */

public class AddingMachine {
	
	//Initialize variables
	private int total;
	private String transactionHistory = "0";
	
	/**
	 * Not used in this assignment.
	 */
	public AddingMachine () {
		
		total = 0;  // not needed - included for clarity
		
		}
	
	/**
	 * @return total
	 */
	public int getTotal () {
		
		return total;
		
		}
	
	/**
	 * @param value
	 * total will equal itself plus the value inputed in main
	 */
	public void add (int value) {
		
		total += value;
		transactionHistory += " + " + value;
		
	}
	
	/**
	 * @param value
	 * total will equal itself minus the value inputed in main
	 */
	public void subtract (int value) {
		
		total -= value;
		transactionHistory += " - " + value;
		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * toString method for printing transactionHistory
	 */
	public String toString () {
		
		return transactionHistory + " ";
		
		}
	
	/**
	 * Not used in this assignment.
	 */
	public void clear() {
		
	}
	
	/**The main method of this application.
	 * @param args array of string arguments
	 */
	public static void main(String[] args) {
		
		//Creates the myCalculator object, and prints the integers
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add (4);
		myCalculator.subtract (2);
		myCalculator.add(5);
		
		System.out.println(myCalculator.toString());
		System.out.println("The total is: " + myCalculator.getTotal() + "\n");
		
		AddingMachine myCalculator1 = new AddingMachine();
		myCalculator1.add (10);
		myCalculator1.subtract (8);
		myCalculator1.add(12);
		
		System.out.println(myCalculator1.toString());	
		System.out.println("The total is: " + myCalculator1.getTotal() + "\n");
		
		
	}
	
}
