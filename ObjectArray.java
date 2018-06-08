public class ObjectArray {
	public static void main (String[] arguments) {
		// Here is where we create an array of objects
		Student[] consultant = new Student[5];
		for (int k = 0; k < consultant.length; k++) {
			consultant[k] = new Student(k + 11);
			System.out.println(consultant[k]);
			// Encapsulation at it's finest. The dot operator can't access the id
		}
	}
}