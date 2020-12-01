import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class customer2 {
	public static void main(String[] args) {
		//getConnection();
		//createTable();
		createCustomer("Danny","1989","11","15","³²¼º");
	}
	
	public static void createCustomer(String nametxt, String year, String month, String day, String gender) {
		try {
			Connection con= getConnection();
			PreparedStatement insert=con.prepareStatement(""
						+"INSERT INTO customer6"
						+"(named, yeard, monthd, dayd, genderd) "
						+ "VALUES "
						+ "('"+nametxt+"','"+year+"','"+month+"','"+day+"','"+gender+"')");
			insert.execute();
			System.out.println("The data has been saved");
		}catch(Exception e) {
			
		}
	}
	
	public static String[][] getCustomers(){
		try {
			Connection con=getConnection();
			PreparedStatement statement=con.prepareStatement("Select named, yeard, monthd, dayd, genderd FROM customer6");
			ResultSet results= statement.executeQuery();
			ArrayList<String[]> list = new ArrayList<String[]>();
			while(results.next()) {
				list.add(new String[] {
						results.getString("named"),
						results.getString("yeard"),
						results.getString("monthd"),
						results.getString("dayd"),
						results.getString("genderd")
				});
//				list.add("Name : "+ results.getString("name") +
//					   	" birth : "+ results.getString("birth")+ 
//					   	" gender : "+ results.getString("gender"));   			
			}
			//System.out.println(list.toString());
			System.out.println("The data has been fetched");
			String[][] arr=new String[list.size()][5];
			return list.toArray(arr);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public static void createTable(String aa) {
		try {
			Connection con= getConnection();
			PreparedStatement createTable=con.prepareStatement(
					"CREATE TABLE "
					+ aa+"( "
					+ "name varChar(255), "
					+ "grossmotor varChar(255), "
					+ "finemotor varChar(255), "
					+ "language varChar(255), "
					+ "social varChar(255), "
					+ "constraint pk_"+aa+"PRIMARY KEY(name))");
			System.out.println(createTable);
			createTable.execute();
			System.out.println("succes create table");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Table successfully created");
		}
	}
	
	public static void createTable2() {
		try {
			Connection con= getConnection();
			PreparedStatement createTable=con.prepareStatement(
					"CREATE TABLE "
					+ "customer6( "
					+ "named varChar(255), "
					+ "yeard varChar(255), "
					+ "monthd varChar(255), "
					+ "dayd varChar(255), "
					+ "genderd varChar(255), "
					+ "constraint pk_customer6 PRIMARY KEY(named))");
			createTable.execute();
			System.out.println("succes create table");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Table successfully created");
		}
	}
	
	public static Connection getConnection() {
		try {
			String driver = "oracle.jdbc.OracleDriver";
			String url ="jdbc:oracle:thin:@localhost:1521/xe";
			String user = "green";
			String pass = "green1234";	

			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,user,pass);
			System.out.println("The Connection Successful");
			return con;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
