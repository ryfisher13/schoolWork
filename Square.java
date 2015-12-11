package Programs;

public class Square extends Rectangle {
	public Square(double side, MyPoint z) {
		super(side, side, z);
	}

	public Square() {
		this(1, new MyPoint(0.5,0.5));
	}

	@Override
	public String toString() {
		return "Square[Side =" + this.getHeight() + "centre = " + this.getCentre() + "]";
	}
}
