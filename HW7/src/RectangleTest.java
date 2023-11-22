import java.util.InputMismatchException;
import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 Rectangle rect = new  Rectangle();
		 boolean validEnter = false;
		 while(!validEnter) {
		 try {
			 //ask user to enter length and width
		 System.out.println("Please enter a width");
		 double d1 = sc.nextDouble();
		 System.out.println("Please enter a length");
		 double d2 = sc.nextDouble();
		 
		 rect.setLength(d1);
		 rect.setWidth(d2);
		 
		 System.out.printf("Perimeter of lectangle is: %f\n", rect.getPerimeter());
		 System.out.printf("The area of rectangle is: %f\n", rect.getArea());
		 validEnter = true;
		 break;
		 
		 //catching the error
			 
		 }catch(InputMismatchException e){
			 System.out.println("Please enter a valid input");
			 sc.nextLine();
			 
		 }catch(IllegalArgumentException e){
			 System.out.println("Exception" +e.getMessage());
			 
		 }
		 
		 }
	 }
	}


