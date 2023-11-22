
public class Rational {

	private int numerator;
	private int denominator;
	
	public Rational () {
		numerator = 1;
		denominator = 1;
	}
	
	public Rational(int numerator, int denominator) {
		if(denominator == 0) {
			throw new IllegalArgumentException("Denominator can't be zero");
		}
		int gcd = gcd(numerator, denominator);
		this.numerator = numerator / gcd;
		this.denominator = denominator / gcd;
	}
	//static add method 
	public static Rational add(Rational r1, Rational r2) {
		int numerator = r1.numerator * r2.denominator + r2.numerator * r1.denominator ;
		int denominator = r1.denominator * r2.denominator;
		return new Rational(numerator, denominator);
	}
	
	//static subtract method
	public static Rational subtract(Rational r1, Rational r2) {
		int numerator = r1.numerator * r2.denominator - r2.numerator * r1.denominator ;
		int denominator = r1.denominator * r2.denominator;
		return new Rational(numerator, denominator);
	}
	
	//static multiplication method
	public static Rational multiply(Rational r1, Rational r2) {
		int numerator = r1.numerator * r2.numerator;
		int denominator = r1.denominator * r2.denominator;
		return new Rational(numerator, denominator);
	}
	
	//static divide method
	public static Rational divide(Rational r1, Rational r2) {
		if(r2.numerator == 0) {
			throw new IllegalArgumentException("Mathematical erro can't be divisible by zero");

		}
		int numerator = r1.numerator * r2.denominator;
		int denominator = r1.denominator * r2.numerator;
		return new Rational(numerator, denominator);
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}
	public String toFloatingPointString(int precision) {
		double value = (double) numerator / denominator;
		return String.format("%." + precision + "f", value);
	}
	//gcd method 
	private int gcd(int x, int y) {
		if( y == 0) {
			return x;
		}
		return gcd(y, x % y);
		
	}
}
