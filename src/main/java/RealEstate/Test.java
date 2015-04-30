package RealEstate;

public class Test {

	public static void main(String[] args) {
		
		SqlJdbc connection = new SqlJdbc();
		//connection.printCon();
		connection.createConnection("jdbc:mysql://localhost:3306/realestate", "root", "evgeny");
		connection.printCon();
		connection.executeSQLQuery("SELECT * FROM perthSuburb");
		connection.closeConnection();

	}

}
