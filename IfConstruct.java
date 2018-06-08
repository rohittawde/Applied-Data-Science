public class IfConstruct {
	public static void main (String[] arguments) {
		int x = Integer.parseInt(arguments[0]);
		if (x > 5) {
			System.out.println("Constructive");
		} else if (x > 7) { // Purposefully placed to contrast between the switch and the if then else statements
			System.out.println("Criti");
		} else {
			System.out.println("Sanon");
		}
	}
} 