
public class Rectangle {
	
	//instantiate a variable
	private double length = 1.0;
	private double width = 1.0;

	
	public double getLength() {
		return length;
	}
	//setting length
	public void setLength(double length) {
		if(length <0 || length > 20) {
			throw new IllegalArgumentException ("For input length: larger than 0.0 and less than 20.0");
		}
		this.length = length;
	}
	//getting width
	public double getWidth() {
		return width;
	}
	//setting width
	public void setWidth(double width) {
		if(width < 0.0 || width > 20.0) {
			throw new IllegalArgumentException ("For input width: larger than 0.0 and less than 20.0");
			
		}
		this.width = width;
		
	}
	//calculate a parameter
	public double getPerimeter() {
		return (length + width) * 2;
	}
//calculate area
	public double getArea() {
		return length * width;
	}
	
	

}
