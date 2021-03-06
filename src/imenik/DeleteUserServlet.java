package imenik;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteUserServlet
 */
@WebServlet("/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username;
		UserDao dao = new UserDaoImp();
		
		/** Get parametar username */
		username = request.getParameter("username");
		
		Service service = new Service();
		
		/** Check if user is in the DB */
		boolean ok = service.authenticate2(username);
		
		if (ok) { // if user is in the DB, delete user and send object user to userdeleted.jsp
			User user = dao.getUser(username);
			dao.deleteUser(username);
			request.setAttribute("user", user);
			request.getRequestDispatcher("userdeleted.jsp").forward(request, response);					
		} else {  // if user isn't in the DB, send string message to userpage.jsp
			request.setAttribute("message", "Korisnik ne postoji u bazi.");
			request.getRequestDispatcher("userpage.jsp").forward(request, response);			
		}
		
	}

}
