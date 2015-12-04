package imenik;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Todorovic Mladen
 * 
 * @class UserDaoImp implements interface UserDao
 *
 */
public class UserDaoImp implements UserDao {
	
	/** Default constructor (empty) */
	public UserDaoImp() {
	}
	
	/**
	 * Method  Adding a new User to the DB
	 * 
	 * @author Mladen Todorovic
	 *
	 * @param ime
	 *            name of user that is going to be added to DB.
	 * @param prezime
	 *            last name of user that is going to be added to DB.
	 * @param telefon
	 *            phone of user that is going to be added to DB.
	 * @param adresa
	 *            address of user that is going to be added to DB.
	 * @param email
	 *            email of user that is going to be added to DB.
	 * @param rodjenje
	 *            date of birth of user that is going to be added to DB.
	 * @param pol
	 *            gender of user that is going to be added to DB.
	 * @param username
	 *            username of user that is going to be added to DB.
	 * @param password
	 *            password of user that is going to be added to DB.
	 */
	@Override
	public void addUser(String ime, String prezime, String telefon, String adresa, String email, String rodjenje,
			String pol, String username, String password) {

		/** Invoke ConnectionUtil Class to establish connection with the DB */
		ConnectionUtil connection = new ConnectionUtil();
		PreparedStatement insertQuery = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection mysqlConnect = connection.connect();
			/** Insert queries into DB */
			insertQuery = mysqlConnect.prepareStatement(
					" INSERT INTO users(ime, prezime, telefon, adresa, email, rodjenje, pol, username, password) "
							+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?) ");
			insertQuery.setString(1, ime);
			insertQuery.setString(2, prezime);
			insertQuery.setString(3, telefon);
			insertQuery.setString(4, adresa);
			insertQuery.setString(5, email);
			insertQuery.setString(6, rodjenje);
			insertQuery.setString(7, pol);
			insertQuery.setString(8, username);
			insertQuery.setString(9, password);
			insertQuery.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				/** Close connection with the DB */
				ConnectionUtil.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * Method  Delete user from the DB
	 *         if username matches with one in the DB,
	 *         that User is deleted from the DB.
	 * 
	 * @author Mladen Todorovic
	 * 
	 * @param username
	 *            username that we are going to search in DB.
	 */
	@Override
	public void deleteUser(String username) {
		
		/**
		 * Invoke ConnectionUtil Class to establish MySQL connection with the DB
		 */
		ConnectionUtil connection = new ConnectionUtil();
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection mysqlConnect = connection.connect();
			/** Delete user from users where username matches username*/
			ps = mysqlConnect.prepareStatement("DELETE FROM users WHERE username = '" + username + "'");
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				/** Close connection with the DB */
				ConnectionUtil.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
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
	 */
	@Override
	public boolean isRegisteredByUsername(String username) {

		/**
		 * Invoke ConnectionUtil Class to establish MySQL connection with the DB
		 */
		ConnectionUtil connection = new ConnectionUtil();
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection mysqlConnect = connection.connect();
			/**
			 * Select columns username and password from the table users
			 */
			ps = mysqlConnect.prepareStatement(" SELECT username FROM users ");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				/**
				 * Check if column username from users is equal to input's
				 * user name, and if column password is equal to input's user password
				 */
				if (rs.getString("username").equals(username)) {
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				/** Close connection with the DB */
				ConnectionUtil.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false; // If user is not found, return false
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
	 * @return true if username & password matches with those in the DB, otherwise false.
	 */
	@Override
	public boolean isRegistered(String username, String password) {

		/**
		 * Invoke ConnectionUtil Class to establish MySQL connection with the DB
		 */
		ConnectionUtil connection = new ConnectionUtil();
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection mysqlConnect = connection.connect();
			/**
			 * Select columns username and password from the table users
			 */
			ps = mysqlConnect.prepareStatement(" SELECT username, password FROM users ");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				/**
				 * Check if column username from users is equal to input's
				 * user name, and if column password is equal to input's user password
				 */
				if (rs.getString("username").equals(username) && rs.getString("password").equals(password)) {
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				/** Close connection with the DB */
				ConnectionUtil.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false; // If user is not found, return false
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
	@Override
	public boolean isAdmin(String username, String password) {

		boolean ok = false;
		/**
		 * Invoke ConnectionUtil Class to establish MySQL connection with the DB
		 */
		ConnectionUtil connection = new ConnectionUtil();
		PreparedStatement ps = null;
		
		/** If username & password matches admin's username & password */
		if (username.matches("djomla") && password.matches("tm")) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection mysqlConnect = connection.connect();
				/**
				 * Select columns username and password from the table users
				 */
				ps = mysqlConnect.prepareStatement(" SELECT username, password FROM users ");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					/**
					 * Check if column username from users is equal to
					 * input's user name, and if column password is equal to
					 * input's user password
					 */
					if (rs.getString("username").equals(username) && rs.getString("password").equals(password)) {
						ok = true;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					/** Close connection with the DB */
					ConnectionUtil.closeConnection();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		} else {
			ok = false;
		}
		return ok;
	}
	/**
	 * Method  Update User in the DB
	 *         where user's username matces username.
	 * 
	 * @author Mladen Todorovic
	 *
	 * @param user
	 *          user that we are going to update in the DB.
	 */
	@Override
	public void updateUser(User user) throws ClassNotFoundException {
		/**
		 * Invoke ConnectionUtil Class to establish MySQL connection with the DB
		 */
		ConnectionUtil connection = new ConnectionUtil();
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection mysqlConnect = connection.connect();
			/** Update the table users where username matches user's username */
			ps = mysqlConnect.prepareStatement(
					"UPDATE users SET ime=?, prezime=?, telefon=?, adresa=?, email=?, rodjenje=?, pol=?, username=?, password=? WHERE username='"
					+ user.getUsername() + "'");
			
			ps.setString(1, user.getIme());
			ps.setString(2, user.getPrezime());
			ps.setString(3, user.getTelefon());
			ps.setString(4, user.getAdresa());
			ps.setString(5, user.getEmail());
			ps.setString(6, user.getRodjenje());
			ps.setString(7, user.getPol());
			ps.setString(8, user.getUsername());
			ps.setString(9, user.getPassword());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				/** Close connection with the DB */
				ConnectionUtil.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/** 
	 * Method Return all users from DB 
	 * 
	 * @author Mladen Todorovic
	 * 
	 * @return list of all users from DB
	 * 
	 * */
	@Override
	public List<User> getAllUsers() {

		List<User> list = new ArrayList<User>();

		/**
		 * Invoke ConnectionUtil Class to establish MySQL connection with the DB
		 */
		ConnectionUtil connection = new ConnectionUtil();
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection mysqlConnect = connection.connect();
			/** Select from the table users */
			ps = mysqlConnect.prepareStatement(" SELECT * FROM users ");
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				rs.beforeFirst();
				/** While there's users data in the DB, add all users in the list */
				while (rs.next()) {

					User user = new User();
					user.setIme(rs.getString("ime"));
					user.setPrezime(rs.getString("prezime"));
					user.setTelefon(rs.getString("telefon"));
					user.setAdresa(rs.getString("adresa"));
					user.setEmail(rs.getString("email"));
					user.setRodjenje(rs.getString("rodjenje"));
					user.setPol(rs.getString("pol"));

					list.add(user);

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				/** Close connection with the DB */
				ConnectionUtil.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		/** Return list with all added users */
		return list;
	}
	/**
	 * Method  Return User from the DB
	 * 
	 * @author Mladen Todorovic
	 * 
	 * @param username
	 *            username that we are going to search in DB.
	 *            
	 * @return User if username matches with username in the DB.
	 */
	@Override
	public User getUser(String username) {

		User user = new User();

		/**
		 * Invoke ConnectionUtil Class to establish MySQL connection with the DB
		 */
		ConnectionUtil connection = new ConnectionUtil();
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection mysqlConnect = connection.connect();
			/** Select username column from the table users */
			ps = mysqlConnect.prepareStatement(" SELECT * FROM users WHERE username ='" + username + "'");
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				rs.beforeFirst();
				while (rs.next()) {

					user.setIme(rs.getString("ime"));
					user.setPrezime(rs.getString("prezime"));
					user.setTelefon(rs.getString("telefon"));
					user.setAdresa(rs.getString("adresa"));
					user.setEmail(rs.getString("email"));
					user.setRodjenje(rs.getString("rodjenje"));
					user.setPol(rs.getString("pol"));
					user.setUsername(rs.getString("username"));
					user.setPassword(rs.getString("password"));

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				/** Close connection with the DB */
				ConnectionUtil.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return user;
	}
	/**
	 * Method  Return list of Users from the DB
	 * 
	 * @author Mladen Todorovic
	 * 
	 * @param search
	 *            that we are going to search in DB.
	 * 
	 * @return list of user(s) if param search matches with those in the DB.
	 */
	@Override
	public List<User> searchUsers(String search) {
		
		List<User> list = new ArrayList<>();
		/**
		 * Invoke ConnectionUtil Class to establish MySQL connection with the DB
		 */
		ConnectionUtil connection = new ConnectionUtil();
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection mysqlConnect = connection.connect();
			/** Select from the table users */
			ps = mysqlConnect.prepareStatement(" SELECT * FROM users");
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				rs.beforeFirst();
				while (rs.next()) {
					String ime = rs.getString("ime");
					String prezime = rs.getString("prezime");
					String telefon = rs.getString("telefon");
					String adresa = rs.getString("adresa");
					String email = rs.getString("email");
					String rodjenje = rs.getString("rodjenje");
					String pol = rs.getString("pol");
					/** If ime or prezime or telefon or adresa or email or rodjenje or pol
					 * matches those from the DB, get that user(s) from the DB */
					if (ime.equals(search) || prezime.equals(search) || telefon.equals(search) || adresa.equals(search)
							|| email.equals(search) || rodjenje.equals(search) || pol.equals(search)) {
						User user = new User();
						user.setIme(ime);
						user.setPrezime(prezime);
						user.setTelefon(telefon);
						user.setAdresa(adresa);
						user.setEmail(email);
						user.setRodjenje(rodjenje);
						user.setPol(pol);

						list.add(user);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				/** Close connection with the DB */
				ConnectionUtil.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		/** Return list with added user(s) */
		return list;
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
	@Override
	public boolean searchIsValid(String search) {
		/**
		 * Invoke ConnectionUtil Class to establish MySQL connection with the DB
		 */
		ConnectionUtil connection = new ConnectionUtil();
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection mysqlConnect = connection.connect();
			/**
			 * Select from the table users
			 */
			ps = mysqlConnect.prepareStatement(" SELECT * FROM users ");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				String ime = rs.getString("ime");
				String prezime = rs.getString("prezime");
				String telefon = rs.getString("telefon");
				String adresa = rs.getString("adresa");
				String email = rs.getString("email");
				String rodjenje = rs.getString("rodjenje");
				String pol = rs.getString("pol");
				/** If ime or prezime or telefon or adresa or email or rodjenje or pol
				 *  from the DB matches param search, return true */
				if (ime.equals(search) || prezime.equals(search) || telefon.equals(search) || adresa.equals(search)
						|| email.equals(search) || rodjenje.equals(search) || pol.equals(search)) {
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				/** Close connection with the DB */
				ConnectionUtil.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false; // If match is not found, return false
	}
}