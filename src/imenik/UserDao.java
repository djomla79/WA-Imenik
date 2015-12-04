package imenik;

import java.util.List;

/**
 * @author Mladen Todorovic
 * 
 * @interface UserDao
 *
 */
public interface UserDao {
	
	public void addUser(String ime, String prezime, String telefon, String adresa,
            String email, String rodjenje, String pol, String username, String password);
	
	public boolean isRegistered(String username, String password);
	
	public List<User> getAllUsers();
	
	public User getUser(String username);
	
	public void deleteUser(String username);
	
	public List<User> searchUsers(String search);
	
	public boolean searchIsValid(String search);
	
	public boolean isRegisteredByUsername(String username);
	
	public boolean isAdmin(String username, String password);
	
	public void updateUser(User user) throws ClassNotFoundException;

}
