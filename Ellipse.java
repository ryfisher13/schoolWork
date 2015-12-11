package Programs;

public class Ellipse {
	private double major;
	private double minor;

	public Ellipse(double major, double minor) {
		this.major = major;
		this.minor = major;
	}

	public double getMinor() {
		return minor;
	}
	
	public double getMajor() {
		return this.major;
	}
	public double getArea(){
		return (Math.PI*this.major*this.minor);
	}

	@Override
	public String toString() {
		return "Ellipse [major=" + major + ", minor=" + minor + "]";
	}
	
}
