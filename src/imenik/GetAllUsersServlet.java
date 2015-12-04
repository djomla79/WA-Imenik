package imenik;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetAllUsersServlet
 */
@WebServlet("/GetAllUsersServlet")
public class GetAllUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UserDao dao = new UserDaoImp();
		
		/** Get list of all users from the DB */
		List<User> list = dao.getAllUsers();
		
		if (!list.isEmpty()) { // If list isn't empty, send list to getallusers.jsp
			request.setAttribute("users", list);
			request.getRequestDispatcher("getallusers.jsp").forward(request, response);
		} else {               // if list is empty, redirect to userpage.jsp
			response.sendRedirect("userpage.jsp");
		}

	}

}
