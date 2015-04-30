package RealEstate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.BeforeTest;

public class SqlJdbc {
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	//Default constructor
	public SqlJdbc(){
		this.conn = null;
		this.stmt = null;
		this.rs = null;
	}
	
	//Parametrized constructor
	public SqlJdbc(Connection conn, Statement stmt, ResultSet rs){
		this.conn = conn;
		this.stmt = stmt;
		this.rs = rs;
	}
	
	public void createConnection(String connectionUrl, String connectionUser, String connectionPassword){
		try {
			conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		//return conn;
	}
	
	public void printCon(){
		System.out.println(conn.toString());
	}
	
	public void executeSQLQuery(String query){
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				String id = rs.getString("idPerthSuburb");
				String firstName = rs.getString("PerthSuburbName");
				System.out.println("ID: " + id + ", First Name: " + firstName);
			}
		}
		
		catch(Exception e){
				e.printStackTrace();
			}
		}
	
	
	public void closeConnection(){
	
		try { if (rs != null) rs.close(); } catch (SQLException e) { e.printStackTrace(); }
		try { if (stmt != null) stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
		try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
	
	}
	
}