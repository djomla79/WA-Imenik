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
		
		search = request.getParameter("search");
		
		UserDao dao = new UserDaoImp();
		Service service = new Service();
		boolean ok = service.search(search);
		
		List<User> list = dao.searchUsers(search);
		
		if (ok && !list.isEmpty()) {
			request.setAttribute("searchusers", list);
			request.getRequestDispatcher("searchlist.jsp").forward(request, response);
		} else {
			response.sendRedirect("search.jsp");
		}
		
	}

}
