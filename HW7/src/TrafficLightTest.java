
public class TrafficLightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("TrafficLight times\n");
		
		//for loop
		for(TrafficLight light:TrafficLight.values()) {
			System.out.printf("%-10s%d seconds \n",light,light.getTime());
		}

	}

}
