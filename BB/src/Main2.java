import java.util.Date;

public class Main2 {

	public static void main(String[] args) {
		String A="";
		String a[]=new String[8];
		int b[]=new int[3];
		Date date=new Date();
		A+=date;
		a=A.split(" ");
		System.out.println(date);
		System.out.println(A);
		
		switch(a[1]) {
		case "Jan":
			b[1]=1; break;
			
		case "Feb":
			b[1]=2; break;
			
		case "Mar":
			b[1]=3; break;
			
		case "Apr":
			b[1]=4; break;
			
		case "May":
			b[1]=5; break;
			
		case "Jun":
			b[1]=6; break;
			
		case "Jul":
			b[1]=7; break;
			
		case "Aug":
			b[1]=8; break;
			
		case "Sep":
			b[1]=9; break;
			
		case "Oct":
			b[1]=10; break;
		
		case "Nov":
			b[1]=11; break;
		
		case "Dec":
		b[1]=12; break;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
