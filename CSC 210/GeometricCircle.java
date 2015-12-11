package Programs;

public class GeometricCircle extends Circle{
	private MyPoint centre;
	public GeometricCircle(double _radius,MyPoint _centre){
		super(_radius);
		centre = _centre;
	}
	@Override
	public String toString() {
		return "GeometricCircle [Radius="+ this.getRadius() + ", centre=" + centre + "]";
	}
	
}
