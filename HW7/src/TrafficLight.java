
public enum TrafficLight {
	
	RED(85),
	GREEN(85),
	YELLOW(10);
	
	//declare time
	private int time;
	
	//constructor
	TrafficLight(int time){
		this.time = time;
	}

	//getting time method
	public int getTime() {
		return time;
	}
}
