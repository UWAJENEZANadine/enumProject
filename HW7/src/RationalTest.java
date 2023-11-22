import java.util.InputMismatchException;
import java.util.Scanner;

public class RationalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		 boolean validEnter = false;
		 while(!validEnter) {
		 try {
		//ask user to enter a numerator and denominator
		System.out.println("Please enter First number: numerator");
		int nume1 = scanner.nextInt();
		
		System.out.println("Please enter First number: denominator");
		int denom1 = scanner.nextInt();
		
		System.out.println("Please enter second number: numerator");
		int nume2 = scanner.nextInt();
		
		System.out.println("Please enter second number: denminator");
		int denom2 = scanner.nextInt();
		

		System.out.println("please enter a precision");
		int digit = scanner.nextInt();
		
		//calling object
		Rational rationa1 = new Rational(nume1, denom1);
		Rational rationa2 = new Rational(nume2, denom2);
		
		
			System.out.println("1.add \n2.Subtract \n3.Multiply \n4.divide");
			System.out.print("Choice any operation\n");
			int ch = scanner.nextInt();
			//allow user to select any operation want
			switch (ch) {
			case 1: 
				Rational sum = Rational.add(rationa1, rationa2);
         
                System.out.println("sum = " + rationa1 + " + " + rationa2 + " = "+ sum + " = " + sum.toFloatingPointString(digit));
				break;
				
			case 2:
				Rational difference = Rational.subtract(rationa1, rationa2);
                System.out.println("difference = " + rationa1 + " - " + rationa2 + " = "+ difference + " = " + difference.toFloatingPointString(digit));
				break; 
			case 3: 
				Rational Mulitply = Rational.multiply(rationa1, rationa2);
                System.out.println("difference = " + rationa1 + " * " + rationa2 + " = "+ Mulitply + " = " + Mulitply.toFloatingPointString(digit));
				break; 
			case 4:
				Rational division = Rational.divide(rationa1, rationa2);
                System.out.println("difference = " + rationa1 + " : " + rationa2 + " = "+ division + " = " + division.toFloatingPointString(digit));
				break; 
				
				
			}
			 validEnter = true;
			 break;
			 
				//catch the error 
			 }catch(InputMismatchException e){
				 System.out.println("Please enter a valid input");
				 scanner.nextLine();
				 
			 }catch(IllegalArgumentException e){
				 System.out.println("Exception" +e.getMessage());
				 
			 }
			 
			 }
		
	}

}
