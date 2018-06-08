public class SmartPrint{
	public static void main (String[] arguments) {
		for (int y = 0; y < arguments.length; y++) {
			System.out.println(arguments[y]);
		}
		
		// Introducing a smarter way to print
		for (String s : arguments) {
			System.out.println(s);
		}
	}
}