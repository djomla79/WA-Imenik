package imenik;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username, password;

		username = request.getParameter("username");
		password = request.getParameter("password");

		Service login = new Service();
		UserDaoImp dao = new UserDaoImp();
		User user = new User();

		boolean ok = login.authenticate(username, password);
		boolean isOk = login.isAdmin(username, password);
		
		if (isOk) {
			user = dao.getUser(username);
			request.getSession().setAttribute("admin", user);
			request.getRequestDispatcher("admin.jsp").forward(request, response);
		} else {
			if (ok) {
				user = dao.getUser(username);
				request.getSession().setAttribute("user", user);
				request.getRequestDispatcher("userpage.jsp").forward(request, response);
				return;
			} else {
				request.setAttribute("message", "Korisnik ne postoji u bazi.");
				request.getRequestDispatcher("login.jsp").forward(request, response);
				return;
			}
		}

	}

}
