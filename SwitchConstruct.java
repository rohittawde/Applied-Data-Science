public class SwitchConstruct {
	public static void main (String[] arguments) {
		int x = Integer.parseInt(arguments[0]);
		
		switch(x) {
			case 1: System.out.println("Kriti");
			case 2: System.out.println("Sanon");
				break;
			case 3:
			case 4:
			case 5: System.out.println("Kirti");
			default: System.out.println("Kharbanda");
		}	
	}
}	