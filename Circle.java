package Programs;
/* Circle a = new Circle(5)
 * 
 * 1)Create a "blank" object of class circle
 * 2)finds a constructor in class Circle with 1 argument of type int(allows to promote arguments)
 * 3)run the constructor from step 2
 * 		a)passing arguments(possible promoting)
 * 		b)with this pointing at Circle created in step 1
 * 4)the result of evaluating new Circle is "this"(the address of the newly created circle object(the blank object
 * 		after initialization)
 * 5)new circle evaluates to an address
 * 6)that address is assigned to a
 */

public class Circle extends Ellipse{
	public Circle(double radius){
		super (radius,radius);
	}
	@Override
	public String toString(){
		return "Circle ["+ this.getMajor() +"]"; 
	}
	public double getRadius(){
		return this.getMajor();	
	}
	/*
	 * // instance variables private double radius;
	 * 
	 * // passing arguments (possible promoting then) public Circle(double
	 * radius) { // "this" pointing at the Circle object that was just created
	 * this.radius = radius; }
	 * 
	 * public Circle() { this(1); }
	 * 
	 * /* a.getRdius() look for a method called getRadius() with 0 arguments;
	 * starting in the dynamic class of a, class Circle call the method from
	 * step 1 passing parameters(this = a)
	 */
	/*
	 * public double getRadius() { return this.radius; }
	 * 
	 * public double getArea(){ return (this.radius*this.radius*Math.PI); }
	 */
}
