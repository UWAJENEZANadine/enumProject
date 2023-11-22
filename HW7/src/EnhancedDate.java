
public class EnhancedDate {
	private int month;  // 1-12
	private int day;   //1-31;
	private int year; //any year
	private int daysPermonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	//constructor: confirm proper value for month and day given the year
    public EnhancedDate(int theMonth, int theDay, int theYear) {
    	month = testMonth( theMonth); //validate month
    	day = testDay(theDay);       //validate day
    	year = testYear(theYear);  //Validate year
    	
    	System.out.printf("Date constructor for date %s \n",this);
    }
    
    
    private int testYear(int evaluateYear) {
    	if(evaluateYear > 0) { //validate year
    		return evaluateYear; 
    	}else {
    		System.out.printf("Invalid year (%d) set year to 1 \n", evaluateYear);
    		return 1;
    	}
    	
    }
    
    //method check proper  month value
    private int testMonth(int evaluateMonth) {
    	if(evaluateMonth > 0 && evaluateMonth <= 12) {
    		return evaluateMonth;
    	}else {
    		System.out.printf("Invalid month (%d) set month to 1 \n", evaluateMonth);
    		return 1;
    	}
    }
    
    //Method for checking a proper day value based on month and year
    private int testDay(int evaluateDay) {
    	//check if day in range of month
    	if(evaluateDay > 0 && evaluateDay <= daysPermonth[month]) 
    		return evaluateDay;
    	
    	//check a leap year
    	if(month == 2 && evaluateDay == 29 && (year % 400 == 0 || (year % 4 == 0 &&  year % 100 != 0 ))) 
    		return evaluateDay;
    		
    	System.out.printf("Invalid day (%d) set day to 1 \n", evaluateDay);
    	return 1;
    	
    }
    public void nextDay() {
    	int evaluateDay = day + 1;
    	if(testDay(evaluateDay) == evaluateDay) {
    		day = evaluateDay;
    	}else {
    		day = 1;
    		nextMonth();
    	}
    		
    }
  //increment the month method
	public void nextMonth() {
		if (month == 12) {
			year++; 
		
		}
		month = month %12 + 1;
	}
	
	//return a string of the form month/day/year
	public String toString() {
		return String.format("%d /%d /%d", month, day,year);
	}
	
	
}
