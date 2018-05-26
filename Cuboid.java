public class Cuboid extends Dimension {
	private double length;
	private double width;
 	private double height;

	public Cuboid (double newLength, double newWidth, double newHeight) {
		super(newLength*newWidth*newHeight);
		length = newLength;
		width = newWidth;
		height = newHeight;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
}