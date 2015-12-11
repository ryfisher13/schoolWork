package Programs;

public class GeometricEllipse extends Ellipse {
	private MyPoint centre;

	public GeometricEllipse(double _major, double _minor, MyPoint _centre) {
		super(_major, _minor);
		centre = _centre;
	}
	@Override
	public String toString(){
		return "GeometricEllipse [centre =" + this.centre + ", Major =" + this.getMajor() + ", Minor =" + this.getMinor() + "]";
	}
}
