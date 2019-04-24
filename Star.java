public class Star {
	public static void main(String[] args) {
		int a;
		try {
			a = Integer.parseInt(args[0]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			printUsage();
		}
	}

	public static void printUsage() {
		System.out.println("How Star Works:");
		System.out.println("Simply type in a number to specify how big a star you want to print!");
	}
}
