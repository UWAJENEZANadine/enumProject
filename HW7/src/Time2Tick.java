
public class Time2Tick {
	private int hour;
	private int minute;
	private int second;
	
	//constructor to initialise the instance to zero
	public Time2Tick() {
		this(0,0,0);
	}
	//constructor to state the hour and set minute and second to zero
	public Time2Tick(int hour) {
		this(hour,0,0);
	}
	//constructor to state the hour, minute and set second to zero
	public Time2Tick(int hour, int minute) {
		this(hour, minute, 0);
	}
	public Time2Tick(int hour, int minute, int second) {
		if(hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("hour must be 0-23");
		}
		if(minute <0 || minute >= 60) {
			throw new IllegalArgumentException("Minute must be 0-59");
		}
		if(second < 0 || second >= 60) {
			throw new IllegalArgumentException("Second must be 0-59");
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	
	}
	
	public Time2Tick(Time2Tick time) {
		this(time.getHour(), time.getMinute(), time.getSecond());
	}
	
	//set methods, set new time value using universal time, validate the data
	public void setTime(int hour, int minute, int second) {
	  if(hour < 0 || hour >= 24) 
		  throw new IllegalArgumentException("hour must be 0-23");
	  
	  if(minute <0 || minute >= 60) 
		  throw new IllegalArgumentException("Minute must be 0-59");
	  
	  if(second < 0 || second >= 60) 
		  throw new IllegalArgumentException("Second mut be 0-59");
	  
	  this.hour = hour;
	  this.minute = minute;
	  this.second = second;
	}
	public void setHour(int hour) {
		 if(hour < 0 || hour >= 24)
			 throw new IllegalArgumentException("hour must be 0-23");
		 
		 this.hour = hour;
				 
	}
	public void setMinute (int minute) {
		if(minute < 0 || minute >= 60) 
			throw new IllegalArgumentException("minute must be 0-59");
			
		
		this.minute = minute;
	}
	public void setSecond (int second) {
		if(second < 0 || second >= 60) 
			throw new IllegalArgumentException("second must be 0-59");
		
		this.second = second;
	}
	
	//get methods
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	
	//increment time by one second
	public void tick() {
		//if second becomes 60, reset it to zero and increment minute by one
		if(second < 59) {
			setSecond(second + 1);
			
		}
		else {
			setSecond(0);
			incrementMinute();
			
		}
		
		
	}
	
	//increment minute by one
	public void incrementMinute() {
		//if minute becomes 60, reset it to zero and increment hour by one
		if(minute < 59) {
			setMinute(minute + 1);
		}
		else {
			setMinute(0);
			incrementHour();
		}	
		
	}
	//increment hour
	public void incrementHour() {
		if(hour < 23) {
			setHour(hour + 1);
		}
		else {
			setHour(0);
		}
		}
	
	//convert to String in universal-time format(HH:MM:SS
	
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	//convert to string in standard-time format (H:MM:SS AM or PM
	public String toString() {
		return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour()== 12) ? 12:getHour()%12), getMinute(), getSecond(),(getHour() < 12 ? "AM" : "PM"));
		
	}
		

}
