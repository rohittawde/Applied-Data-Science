class Investor {
	public static void main (String[] arguments) {
		float total = 1500;
		System.out.println("Initial Investment :$" + total);
		total = 1.4F * total;
		System.out.println("After first year :$" + total);
		total = total - 500F;
		System.out.println("After Second Year :$" + total);
	}
}
