package Variable;

/**
 * <h1>Soal 3: Constants</h1>
 * Constants program implements an application
 * to convert a paper size from inches to centimeters
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-02-12
 */

public class Constants {
	/**
	 * This is the main method.
	 * Here's where the number of inches is 
	 * multiplied by centimeters per inch
	 * and turns into centimeters
	 */
	public static void main(String[] args) { 
		 final double CM_PER_INCH = 2.54; 
		 double paperWidth = 8.5; 
		 double paperHeight = 11; 
		 System.out.println("Paper size in centimeters: " + 
		 paperWidth * CM_PER_INCH + " by " + paperHeight * 
		 CM_PER_INCH); 
		} 
}
