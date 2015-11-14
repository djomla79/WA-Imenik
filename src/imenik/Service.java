package imenik;

public class Service {

	public Service() {
	}

	public boolean authenticate(String username, String password) {

		UserDao dao = new UserDaoImp();

		if (dao.isRegistered(username, password)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isAdmin(String username, String password) {
		
		UserDao dao = new UserDaoImp();
		
		if (dao.isAdmin(username, password)) {
			return true;
		} else {
			return false;
		}
		
	}

	public boolean authenticate2(String username) {

		UserDao dao = new UserDaoImp();

		if (dao.isRegisteredByUsername(username)) {
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

	public boolean search(String search) {

		UserDao dao = new UserDaoImp();

		if (dao.searchIsValid(search)) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * @ Login servlet
	 * 
	 * protected void doPost(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * method stub
	 * 
	 * // get the username and password parameters String username =
	 * request.getParameter("username"); String password =
	 * request.getParameter("password"); // default message is null String
	 * message = null;
	 * 
	 * // get user data object UserDao udao = new UserDaoImpl();
	 * RequestDispatcher rdIndex = request.getRequestDispatcher("index.jsp");
	 * HttpSession session = request.getSession(); UserServiceImpl userService =
	 * new UserServiceImpl(); try { Map<String, User> users =
	 * udao.getUsers(conn); if (userService.validateLogin(username, password,
	 * conn)) { User sessionUser = users.get(username); if
	 * (sessionUser.getRole() == 0) { session.setAttribute("user", sessionUser);
	 * session.setAttribute("connection", conn);
	 * response.sendRedirect("basic.jsp"); } else { session.setAttribute("user",
	 * sessionUser); session.setAttribute("connection", conn);
	 * response.sendRedirect("administration.jsp"); } } else { message =
	 * userService.getErrorMessage(); request.setAttribute("message", message);
	 * request.setAttribute("username", username); rdIndex.forward(request,
	 * response); } } catch (SQLException e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); } }
	 * 
	 * <nav class="navbar navbar-inverse" style="border-radius: 0px;"
	 * > <div class="container-fluid"> <div class="navbar-header"> <a class=
	 * "navbar-brand" style="color: #e3e3e3;" href="#">Imenik</a> </div> <div>
	 * <ul class="nav navbar-nav">
	 * <!-- inside li: class="active" -->
	 * <li><a href="#">Kontakti</a></li>
	 * 
	 * <li><a href="http://localhost:3306/imenik/signupuser.jsp">Sign up</a>
	 * </li>
	 * <li><a href="http://localhost:3306/imenik/login.jsp">Log in</a></li>
	 * 
	 * <li><a href="http://localhost:3306/imenik/listuser.jsp">Korisnik info</a>
	 * </li>
	 * <li><a href="LogOut">Log Out</a></li>
	 * </ul>
	 * </div> </div> </nav>
	 */

}
