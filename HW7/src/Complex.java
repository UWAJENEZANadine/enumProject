
public class Complex {
	private double real;
	private double imaginary;
	
	//Constructor with default values
	public Complex () {
		real = 0.0;
		imaginary = 0.0;
		real = 0.0;
		
	}
	
	//constructor with user-specified values
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	//Method to add two complex numbers
	public Complex add(Complex other) {
		double r = this.real + other.real;
		double I = this.imaginary + other.imaginary;
		return new Complex(r, I);
		
	}

	//Method to subtract two complex
	public Complex subtract(Complex other) {
		double r = this.real - other.real;
		double I = this.imaginary - other.imaginary;
		return new Complex(r, I);
				
	}
	//Method to print the complex number
	public void print() {
		String realstr = String.format("%.1f", real);
		String  imaginaryStr  = String.format("%.1f", imaginary);
	    System.out.printf("(" + realstr + "," + imaginaryStr + ")");
	}

}

