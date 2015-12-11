package Programs;

public class Rectangle {
	private double width;
	private double height;
	private MyPoint centre;

	public Rectangle(double _Width, double _Height, MyPoint _centre) {
		height = _Height;
		width = _Width;
		centre = _centre;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public MyPoint getCentre() {
		return this.centre;
	}

	public double getArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", centre=" + centre + "]";
	}
}