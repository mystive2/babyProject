
public class time {
	private static String oyear;
	private static String omonth;
	private static String oday;
	
	public time() {
		
	}
	
	public time(String oyear, String omonth, String oday) {
		this.oyear=oyear;
		this.omonth=omonth;
		this.oday=oday;
	}
	
	public static String getoyear() {
		return oyear;
	}
	
	public static String getomonth() {
		return omonth;
	}
	
	public static String getoday() {
		return oday;
	}
	
	
	
}
