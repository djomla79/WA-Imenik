package imenik;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
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
		
		String search;
		
		/** Get search parameter */
		search = request.getParameter("search");
		
		UserDao dao = new UserDaoImp();
		Service service = new Service();
		/** Check if search exists in the DB */
		boolean ok = service.search(search);
		
		/** Get list of user(s) from the DB */
		List<User> list = dao.searchUsers(search);
		
		if (ok && !list.isEmpty()) { // if search exists in the DB & list isn't empty, send list of user(s) to searchlist.jsp
			request.setAttribute("searchusers", list);
			request.getRequestDispatcher("searchlist.jsp").forward(request, response);
		} else {                     // if search doesn't exist in the DB or list is empty, send a message to search.jsp
			request.setAttribute("message", "Unos ne postoji u bazi.");
			request.getRequestDispatcher("search.jsp").forward(request, response);
		}
		
	}

}
