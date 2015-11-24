package imenik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Todorovic Mladen
 * 
 * @class ConnectionUtil za povezivanje sa bazom
 *
 */
public class ConnectionUtil {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/imenik";
	static final String USER = "root";
	static final String PASS = "";
	static Connection conn = null;
	static Statement stat = null;

	public Connection connect() throws SQLException {

		conn = DriverManager.getConnection(DB_URL, USER, PASS);

		return conn;
	}

	public static Statement statment() throws SQLException {
		stat = conn.createStatement();
		return stat;
	}

	public static void closeConnection() throws SQLException {
		conn.close();
	}

	public static String getUser() {
		return USER;
	}

	public static String getPass() {
		return PASS;
	}

}
