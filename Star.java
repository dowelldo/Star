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
		int size;
		// if user fails to use any arguments, print usage
		try {
			size = Integer.parseInt(args[0]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			printUsage();
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
