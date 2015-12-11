package Programs;

public class MyPoint {
	private double x;
	private double y;

	public MyPoint(double _x, double _y) {
		this.x = _x;
		this.y = _y;
	}

	public MyPoint() {
		this(0.0, 0.0);
	}

	public double getY() {
		return this.y;
	}

	public double getX() {
		return this.x;
	}
	@Override
	public String toString(){
		return "(" + this.x + ","+this.y+")";
	}
}
