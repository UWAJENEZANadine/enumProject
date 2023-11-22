import java.util.InputMismatchException;
import java.util.Scanner;

public class ComplexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ask user to enter a real and imaginary number
		
		Scanner scanner = new Scanner(System.in);
		
		//boolean for testing while the condition
		 boolean validEnter = false;
		 while(!validEnter) {
		 try {
		
		System.out.println("Please enter first real number a number ");
		double c1real = scanner.nextDouble();
		
		System.out.println("Please enter first imaginary number a number "); 
		double c1Imaginary = scanner.nextDouble();
		
		System.out.println("Please enter second real number a number "); 
		double c2real = scanner.nextDouble();
		
		System.out.println("Please enter second imaginary number a number "); 
		double c2Imaginary = scanner.nextDouble();
		
		Complex app1 = new Complex(c1real, c1Imaginary);
		Complex app2 = new Complex(c2real , c2Imaginary);
		
		Complex sum = app1.add(app2);
		Complex subtra = app1.subtract(app2);
		
		
		System.out.println("The addition of two complex number");
		sum.print();
		System.out.println("");
		
		System.out.println("The subtraction of two complex number");
		subtra.print();
		 validEnter = true;
		 break;
		 
			 //catching the mistmach error
		 }catch(InputMismatchException e){
			 System.out.println("Please enter a valid input");
			 scanner .nextLine();
			 
		 }catch(IllegalArgumentException e){
			 System.out.println("Exception" +e.getMessage());
			
		 }
		 
		 }
		

	}

}
