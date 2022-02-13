package DataTypes;

import java.util.Scanner; //to use input
import java.lang.Math; //to use power function.

/**
 * <h1>Soal 2 : Data Types</h1>
 * Data Types program implements an application
 * to determine the primitive data type of integer input
 * and prints the output on the screen
 * 
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-02-13
 */

public class DataTypes {
	/**
     * This method is used to determine if a number
     * can be assign to anywhere.
     * 
     * @param number the number you want to check whichever data type can hold it.
     * 
     */
	
	public void CheckDataType(long number) {
        System.out.printf("%d can be fitted in: \n", number);
        if (number >= -(Math.pow(2, 7)) && number <= (Math.pow(2, 7)) - 1) {
            System.out.println("*byte");
        }
        if (number >= -(Math.pow(2, 15)) && number <= (Math.pow(2, 15)) - 1) {
            System.out.println("*short");
        }
        if (number >= -(Math.pow(2, 31)) && number <= (Math.pow(2, 31)) - 1) {
            System.out.println("*integer");
        }
        System.out.println("*long");
    }
	
	/**
     * This is the main method.
     * Here's where the input function located.
     * 
     * @param args unused.
     */
	public static void main(String args[]) {
		DataTypes obj = new DataTypes();
		
		// scan total input
		int inputTotal;
        Scanner input = new Scanner(System.in);
        inputTotal = input.nextInt();
        
        String[]number = new String[inputTotal];
        // create an object of Scanner
        for(int i=0; i<inputTotal; i++) {
        	number[i]=input.next();
        }
        for(int i=0; i<inputTotal; i++) {
        	try {
        		long x = Long.parseLong(number[i]);
        		obj.CheckDataType(x);
        	}catch(Exception e) {
        		System.out.println("can't be fitted anywhere.");
        	}
        }
	}
}
