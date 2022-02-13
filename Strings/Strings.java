package Strings;

import java.util.Scanner; //to use input 
	/**
	 * <h1>Soal 6 : Strings(1)</h1>
	 * Strings program implements an application
	 * to determine sum the length of two strings (A and B),
	 * determine if A is lexicographically larger than B, and
	 * capitalize the first letter in A and B and print them on a single line
	 * separated by a space.
	 * 
	 * @author Nayara Saffa
	 * @version 1.0
	 * @since 2022-02-13
	 */

public class Strings {
	/**
     * This is the main method.
     * where's both string A and B inputted.
     * And Uppercasing the string.
     * @param args unused.
     */
    public static void main(String args[]) {

        try (Scanner input = new Scanner(System.in)) {
            String A = input.nextLine();
            String B = input.nextLine();
            System.out.println(A.length() + B.length());
            if ((A.compareTo(B)) == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            // Stringname.substring(starting index,end of the index).toUpperCase() will add
            // uppercase
            // from starting index until the end of index.
            // Stringname.substring(index) will remove a character of index in a string.
            // if A.substring(1, 1).toUpperCase() is used instead it will just remove the
            // first char of string.
            // if A.substring(2) instead it will remove 2 character from initial string
            // before toUpperCase().
            // if only A.substring(0, 1).toUpperCase() it will become just uppercase of string A index 1.
            System.out.printf("%s %s", A.substring(0, 1).toUpperCase() + A.substring(1),
                    B.substring(0, 1).toUpperCase() + B.substring(1));
        } catch (Exception e) {
            System.out.println("something error");
        }
    }
}
