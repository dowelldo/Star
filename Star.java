/**
 * This is a simple exersize in Java to print out a star whose size
 * is based on a command line argument.
 *
 * Example: java Star 5
 * 
 *                   *
 *                  ***
 *                 *****
 *                *******
 *               *********
 *          *******************
 *           *****************
 *            ***************
 *             *************
 *              ***********
 *             ****** ******
 *            *****     *****
 *           ****         ****
 *          ***             ***
 *         **                 **
 *        *                     *
 *
 * @author Owen Dowell
 * @version 1.0
 */

public class Star {
	/**
	 * Main method that drives the application
	 *
	 * @param args holds the specified size value
	 */
	public static void main(String[] args) {
		int size = 0;
		// if user fails to use any arguments, print usage
		try {
			size = Integer.parseInt(args[0]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			printUsage();
		}
		
		if (size == 0) System.out.println(); // print nothing when size == 0
		else {
			// first, print the top point
			printTop(size);

			// then, print the middle of the star
			printMiddle(size);

			// finally, print the bottom two points
			printBottom(size);
		}
	}

	/**
	 * printTop:
	 * 
	 * Prints the top point on the star.
	 * 
	 * printTop(5);
	 *          *
	 *         ***
	 *        *****
	 *       *******
	 *      *********
	 *
	 *
	 * @param size is the size of the point to print
	 */
	public static void printTop(int size) {
		// Sets the offset for the shape.  +1 is for asthetics.
		int space = size + 1;
		
		// Sets the number of stars to be printed per loop 
		// iteration to 1.  After the loop iterates, this value
		// will go up by 2.
		int stars = 1;
		int i = 0;
		int j = 0;
		for (i = 0; i < size; i++) {
			// print space number of spaces
			for (j = 0; j < space; j++) {System.out.print(" ");}
			
			// print size - i spaces
			for (j = 0; j < size - i; j++) {System.out.print(" ");}

			// print stars number of asterisks
			for (j = 0; j < stars; j++) {System.out.print("*");}
			System.out.println();

			stars += 2;
		}
	}

	/**
	 * printMiddle:
	 *
	 * Prints the middle two points of the star.  This is an 
	 * upside down quadrilateral.
	 *
	 * printMiddle(5);
	 * *******************
	 *  *****************
	 *   ***************
	 *    *************
	 *     ***********
	 * 
	 * @param size is the size of the shape to print
	 */
	public static void printMiddle(int size) {
		// Sets the offset for the shape.  This value will
		// increment by 1 after each loop iteration.
		int space = 1;
		
		// Sets the number of stars to be printed per loop 
		// iteration.  The shape needs to extend out passed
		// the ends of the top point by size number of stars,
		// and the middle needs to be full of stars.  This 
		// value will decrease by 2 after each iteration.
		int stars = (size * 4) + 1;
		int i = 0;
		int j = 0;
		for (i = 0; i < size; i++) {
			// print space number of spaces for the offset
			for (j = 0; j < space; j++) {System.out.print(" ");}

			// print stars number of asterisks
			for (j = 0; j < stars; j++) {System.out.print("*");}
			System.out.println();
			stars -= 2;
			space++;
		}
	}

	/**
	 * printBottom:
	 *
	 * Prints the bottom two points of the star.
	 *
	 * printBottom(5);
	 *     ***** *****
	 *    ****     ****
	 *   ***         ***
	 *  **             **
	 * *                 *
	 *
	 * @param size is the size of the shape to print.
	 */
	public static void printBottom(int size) {
		// Sets the offset for the shape
		int space = size + 1;
		
		// Sets the number of stars to print.  This will
		// print twice as many stars as the value set per
		// line, one for each point.  This value will 
		// decrement by one after each loop iteration.
		int stars = size;

		// Sets the amount of space between each point.
		int middle = 1;
		int i = 0;
		int j = 0;
		for (i = 0; i < size; i++) {
			// print the offset in spaces:
			for (j = 0; j < space; j++) {System.out.print(" ");}

			// Print the first point:
			for (j = 0; j < stars; j++) {System.out.print("*");}

			// print the space in the middle:
			for (j = 0; j < middle; j++) {System.out.print(" ");}

			// print the other point:
			for (j = 0; j < stars; j++) {System.out.print("*");}
			System.out.println();
			space--;
			stars--;
			middle += 4;
		}
	}

	/**
	 * printUsage:
	 *
	 * prints simple directions for operating the application.
	 * Only executes when user fails to provide input.
	 */
	public static void printUsage() {
		System.out.println("How Star Works:");
		System.out.println("Simply type in a number to specify how big a star you want to print!");
	}
}
