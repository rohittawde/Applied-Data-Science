public class Cube extends Cuboid {
	private double edge;

	public Cube (double newEdge) {
	super(newEdge,newEdge, newEdge);
	edge = newEdge;
	}

	public double getEdge() {
		return edge;
	}
    
    // Overriding the tostring method
    @Override
    public String toString() {
        return "Cube(side = "  + edge + ")";
	
    }
}

 
