
public class Time2 {
	//variable declaration
	private int secondMidnight; 
	
	//constructor to initialise the instance to zero
	public Time2() {
		this(0,0,0); //Time 2 constructor with 3 arguments
	}
	
	//Time2 constructor hour given and set minute and second to default
	public Time2(int hour) {
		this(hour, 0, 0);
	}
	
	//Time2 constructor hour and minute given and set second to zero
	public Time2(int hour, int minute) {
		this(hour, minute,0);
	}
	
	//Time2 constructor all are given hour, minute, second
	public Time2(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}
	
	public Time2(Time2 time) {
		this(time.getHour(), time.getMinute(), time.getSecond());
	}

	//check validity, and set invalid to zero
	public void setTime(int hour, int minute, int second) {
		
		if(((hour >= 0) && (hour < 24))) {
			 secondMidnight = hour *60 *60;
		}else {
			 secondMidnight = 0;
		}
		
		if(((minute >= 0) && (minute < 60))) {
			 secondMidnight =  secondMidnight + minute * 60;
		}
		if(((second >= 0) && (second < 60))) {
			 secondMidnight =  secondMidnight + second;
		}
	}
	
	public int getHour() {
		return  secondMidnight /3600 ;
	}
	public int getMinute () {
		return  secondMidnight % 3600 / 60;
	}
	public int getSecond() {
		return  secondMidnight % 60;
	}
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	public String toString() {
		return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() %12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}
		
		
	
}