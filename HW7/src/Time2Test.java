
public class Time2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time2 t1 = new Time2();                //00:00:00
		Time2 t2 = new Time2(2);              //02:00:00
		Time2 t3 = new Time2(21,34);         //21:34:00
		Time2 t4 = new Time2(13,25,42);     //12:25:42
		Time2 t5 = new Time2(27,74,99);    //00:00:00
		Time2 t6 = new Time2(t4);         //12:25:42

		//display output
		System.out.println("constructed with:");
		System.out.println("t1: all arguments defaulted");
		System.out.printf("  %s\n", t1.toUniversalString());
		System.out.printf("  %s\n", t1.toString());
		
		System.out.println("t2: hour stated, minute and second defaulted");
		System.out.printf("  %s\n", t2.toUniversalString());
		System.out.printf("  %s\n", t2.toString());
		
		System.out.println("t3: hour and minute stated, second defaulted");
		System.out.printf("  %s\n", t3.toUniversalString());
		System.out.printf("  %s\n", t3.toString());
		
		System.out.println("t4: all stated");
		System.out.printf("  %s\n", t4.toUniversalString());
		System.out.printf("  %s\n", t4.toString());
		
		System.out.println("t5: invalid value stated");
		System.out.printf("  %s\n", t5.toUniversalString());
		System.out.printf("  %s\n", t5.toString());
		
		System.out.println("t6: Time 2 object t4 stated");
		System.out.printf("  %s\n", t1.toUniversalString());
		System.out.printf("  %s\n", t1.toString());
	}

}
