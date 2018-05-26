public class Sphere extends Dimension {
	// Declaring class variable
	private double radius;  

	// Constructor
	public Sphere (double newRadius) {
	super(4.0 / 3.0 * Math.PI * newRadius *newRadius * newRadius );
	radius = newRadius;
	}

	// Defining a function because encapsulation prevents you from accessing the variables
	public double getRadius() {
		return radius;
	}
}