
public class EnhancedDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Checking increment");
		EnhancedDate d = new EnhancedDate (11, 30, 1998);
		
		//increment day, month and year
		for(int counter=0; counter < 40; counter++) {
			d.nextDay();
			System.out.printf("Incremented Date : %s \n", d.toString());
		}

	}

}
