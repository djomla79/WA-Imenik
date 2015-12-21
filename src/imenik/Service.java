package imenik;
/**
 * 
 * @author Mladen todorovic
 * 
 * class Service
 * 
 * */
public class Service {
	
	/** Default constructor (empty) */
	public Service() {
	}
	
	/**
	 * Method  Check if username & password exists in the DB 
	 * 
	 * @author Mladen Todorovic
	 * 
	 * @param username
	 *            username that we are going to search in DB.
	 * @param password
	 *            password that we are going to search in DB.
	 *            
	 * @return true if username & password match with those in the DB, otherwise false.
	 * 
	 * */
	public boolean authenticate(String username, String password) {

		UserDao dao = new UserDaoImp();

		if (dao.isRegistered(username, password)) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Method  Check if user is Admin
	 * 
	 * @author Mladen Todorovic
	 * 
	 * @param username
	 *            username that we are going to search in DB.
	 * @param password
	 *            password that we are going to search in DB.
	 *            
	 * @return true if username & password matches
	 *            admin's username & password, otherwise false.
	 */
	public boolean isAdmin(String username, String password) {
		
		UserDao dao = new UserDaoImp();
		
		if (dao.isAdmin(username, password)) {
			return true;
		} else {
			return false;
		}
		
	}
	/**
	 * Method  Check if username exists in the DB 
	 * 
	 * @author Mladen Todorovic
	 * 
	 * @param username
	 *            username that we are going to search in DB.
	 *            
	 * @return true if username matches with one in the DB, otherwise false.
	 * 
	 * */
	public boolean authenticate2(String username) {

		UserDao dao = new UserDaoImp();

		if (dao.isRegisteredByUsername(username)) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Method  Check if search exists in the DB
	 * 
	 * @author Mladen Todorovic
	 * 
	 * @param search
	 *            that we are going to search in DB.
	 * 
	 * @return true if search exists in the DB, otherwise false.
	 */
	public boolean search(String search) {

		UserDao dao = new UserDaoImp();

		if (dao.searchIsValid(search)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean imePrezime(String ime, String prezime) {

		UserDao dao = new UserDaoImp();

		if (dao.isRegisteredByName(ime, prezime)) {
			return true;
		} else {
			return false;
		}
	}
	
}
