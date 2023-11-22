import java.util.InputMismatchException;
import java.util.Scanner;

public class Time2TickTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Time2Tick tick = new Time2Tick();
		
		boolean validEnter = false;
		 while(!validEnter) {
		 try {
		
		//ask user to enter a hour, minute, second
		System.out.println("Please enter hour");
		int hour = sc.nextInt();
		tick.setHour(hour);
		
		
		System.out.println("Please enter minute");
		int minute = sc.nextInt();
		tick.setMinute(minute);
		
		System.out.println("Please enter second");
		int second = sc.nextInt();
		tick.setSecond(second);
		
		
		//displaying the time entered from user in universal and 12 hours format
		System.out.println("Time in universal: " + tick.toUniversalString());
		System.out.println("Time in 12 hours: " + tick.toString());
		
		//displaying time after adding one second in universal and 12 hours format
		tick.tick();
		System.out.println("Time universal after adding one second " + tick.toUniversalString());
		System.out.println("Time in 12 hours after adding one second: " + tick.toString());
		
		//displaying time after adding one minute in universal and 12 hours format
		tick.incrementMinute();
		System.out.println("Time universal after adding one minute " + tick.toUniversalString());
		System.out.println("Time in 12 hours after adding one minute: " + tick.toString());
				
		//displaying time after adding one second in universal and 12 hours format
		tick.incrementHour();
		System.out.println("Time universal after adding one hour " + tick.toUniversalString());
		System.out.println("Time in 12 hours after adding one hour: " + tick.toString());
		
		System.out.println("");

		
		 System.out.println("please if you want enter a second to tick:");
		 int ticks = sc.nextInt();
		 if(ticks < 0 || ticks > 59) {
			 System.out.println("second must be in a valid range of 0-59");
		 }
		 else {
			 
		 if(ticks < 59) {
				tick.setSecond(second + 1);
				
			}
			else {
				tick.setSecond(0);
				tick.incrementMinute();
				
			}
		

			 System.out.println("Time universal after adding seconds " + tick.toUniversalString());
			 System.out.println("Time in 12 hours after adding seconds: " + tick.toString());
		 
		 }
		 
		 validEnter = true; 
		 break;
		 
		//catching the errors	 
		 }catch(InputMismatchException e){
			 System.out.println("Please enter a valid input");
			 sc.nextLine();
			 
		 }catch(IllegalArgumentException e){
			 System.out.println("Exception: valid range " +e.getMessage());
			 
		 }
		 
		 }
	}

}
