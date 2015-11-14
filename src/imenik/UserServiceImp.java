package imenik;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImp implements UserService {
	
	/**
	String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*"
			//+ "@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	String INTERNATIONAL_PHONE_PATTERN = "^\\+(?:[0-9] ?){6,14}[0-9]$";
	String NAME_PATTERN = "^([a-zA-Z]+[,.]?[ ]?|[a-zA-Z]+['-]?)+$";
	*/
	
	@Override
	public boolean authenticate(String username, String password) {
		
		UserDao dao = new UserDaoImp();
		
		if (dao.isRegistered(username, password)) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean validateLogin(String username, String password) throws SQLException {
		
		boolean correct = false;
		UserDao udao = new UserDaoImp();
		
		List <User> list = udao.getAllUsers();
		if (list.contains(username)) {
			if (list.contains(password)) {
				correct = true;
			} else {
				correct = false;
			}
		} else {
			correct = false;
		}
		return correct;
	}
}
