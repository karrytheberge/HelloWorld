import java.util.Calendar;

public class Hello {
	
	/** 
	 * Implement the application
	*@param args arguments 
	*/
	public static void main(String[] args) {
		System.out.println("Here Ye, Here Ye: Important Announcement");
		System.out.println("Hello world!");
		System.out.println("Now...goodbye \n");
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH) + 1;
		int date = calendar.get(Calendar.DATE);
		int year = calendar.get(Calendar.YEAR);
		System.out.println("Today's date is " + month + ("/") + date + ("/") + year);
		
	}

}
