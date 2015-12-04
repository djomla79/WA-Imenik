package imenik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Mladen Todorovic
 * 
 * @class ConnectionUtil to establish MySQL connection with the DB.
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

}
