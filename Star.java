/**
 * This is a simple exersize in Java to print out a star whose size
 * is based on a command line argument.
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
	 * @param size is the size of the point to print
	 */
	public static void printTop(int size) {
		return;
	}

	/**
	 * printMiddle:
	 *
	 * Prints the middle two points of the star.  This is an 
	 * upside down quadrilateral.
	 * 
	 * @param size is the size of the shape to print
	 */
	public static void printMiddle(int size) {
		return;
	}

	/**
	 * printBottom:
	 *
	 * Prints the bottom two points of the star.
	 *
	 * @param size is the size of the shape to print.
	 */
	public static void printBottom(int size) {
		return;
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
