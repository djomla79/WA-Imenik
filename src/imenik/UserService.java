package imenik;

import java.sql.SQLException;

/**
 * @author Todorovic Mladen
 * 
 * @interface UserService
 *
 */
public interface UserService {
	
	boolean validateLogin(String username, String password) throws SQLException;
	
	boolean authenticate(String username, String password) throws SQLException;
	
}