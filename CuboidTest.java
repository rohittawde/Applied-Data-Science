public class CuboidTest {
	public static void main (String[] arguments) {
		Cuboid w = new Cuboid(10.0, 22.3, 55.3);
		double wl = w.getLength();
		double wa = w.getVolume();
		System.out.println(wl);
		System.out.println(wa);
	
	}
}