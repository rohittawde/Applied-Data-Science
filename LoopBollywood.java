public class LoopBollywood {
	public static void main (String[] arguments) {
		int x = 0;
		
		while (x < arguments.length) {
			System.out.println("Tofa");
			x = x + 1;
		}
		
		for (int j = 0; j < arguments.length; j++) {
			System.out.println("Laya");
		}
		
		System.out.println();
		System.out.println(arguments[0]);
		if (arguments[0] instanceof String);
                	System.out.println("String ");
		System.out.println("longness mesure :p " + arguments[0].length());
		
	}
}
 