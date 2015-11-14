package imenik;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetUserServlet
 */
@WebServlet("/GetUserServlet")
public class GetUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String ime, prezime;
		UserDao dao = new UserDaoImp();
		User user = new User();
		Service service = new Service();
		
		ime = request.getParameter("ime");
		prezime = request.getParameter("prezime");
		
		boolean ok = service.imePrezime(ime, prezime);
		
		if (ok) {
			user = dao.getUserByName(ime, prezime);
			request.setAttribute("list", user);
			//response.sendRedirect("listuser.jsp");
			request.getRequestDispatcher("listuser.jsp").forward(request, response);
			//RequestDispatcher dis = request.getRequestDispatcher("listuser.jsp");
			//dis.forward(request, response);
		} else {
			response.sendRedirect("getuser.jsp");
		}

	}

}
