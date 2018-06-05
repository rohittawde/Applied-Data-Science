class Passer {
	void toUpperCase(String[] text) {
		for (int i = 0; i < text.length; i++) {
			text[i] = text[i].toUpperCase();
			}
	}
	public static void main(String[] arguments) {
		Passer pass = new Passer();
		// Java stores the arguments as an array of strings and passes it to the 
		// main method
		pass.toUpperCase(arguments);
		for (int i = 0; i < arguments.length; i++) {
			System.out.print(arguments[i] + " ");
		}
		System.out.println();
		System.out.println(arguments[0]);
	}
}