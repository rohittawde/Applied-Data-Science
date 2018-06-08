public class SelectionSort {
		public static void main (String[] arguments) {

			// Defining an array of the same dimensions as that of the number of arguments being passed 
			int[] array = new int[arguments.length];
			for (int i = 0; i < arguments.length; i++) {
				// Populating that array with the integers which we just passed
				array[i] = Integer.parseInt(arguments[i]);
			}

			for (int k = 0; k < arguments.length; k++) {
				for (int j = k+1; j < arguments.length; j++) {
					if (array[k] > array[j]) {
						int temp = array[k];
						array[k] = array[j];
						array[j] = temp;
					}
				}
			}
			for (int s = 0; s < arguments.length; s++) {
				System.out.println(array[s]);
			} 
		}
}