public class VolumeTest {
	public static void main (String[] arguments) {
		
        // Creating an instance of Dimension and assigning an volume to it
        Dimension d = new Dimension(6);
        
        // Using the class method to get the volume of the 3D object
		double v = d.getVolume();
        System.out.println("The naive area is as follows: " + v);
        System.out.println();
        
        // Creating instance of the type sphere
        Sphere s = new Sphere(3.0);
        
        // Using the clas method inherited or not ot get Radius and the Volume
        double sr = s.getRadius();
        double sv = s.getVolume();
        System.out.println("The radius of the sphere is: " + sr);
        System.out.println("Corresponding Voulme is: " + sv);
        System.out.println();
        
        // Creating an instance of the Cuboid type directly inherited from Shape
        Cuboid c = new Cuboid(6.0,2.0,4.9);
        
        /*
        If we don't override the toString method in Shape we get back the memory location pointed by the referance variable.
        Here we can observe the effect when we print out the type wthout overriding toString in it's parent class
        */
        System.out.println("Without overriding");
        System.out.println(c);
        System.out.println();
        
        // We override the toString method in Cube and now we observe it's effect
        Cube i = new Cube(9.0);
        System.out.println("With overriding");
        System.out.println(i);
        System.out.println();
        
        /* To demonstrate polymorphism we store the instance of the Cube into a variable of the type Dimension
        Now when we call the print command we get it alligned with the Cube class' print method.
        Superclass variable can referance the instances of a sub class. Same thing with Object class.
        This can be attributed to dynamic binding which happens late at run type. This is dictated by the instance
        type and not by the reference type.
        While binding they go from the bottom of the class heirarchy.
        */
        Dimension sq = i;
        System.out.println(sq);
        
	}
}
