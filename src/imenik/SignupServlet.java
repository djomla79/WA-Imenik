package imenik;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupServlet
 */
@WebServlet("/signupservlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String ime, prezime, telefon, adresa, email, rodjenje, pol, username, password;
		
		ime = request.getParameter("ime");
		prezime = request.getParameter("prezime");
		telefon = request.getParameter("telefon");
		adresa = request.getParameter("adresa");
		email = request.getParameter("email");
		rodjenje = request.getParameter("rodjenje");
		pol = request.getParameter("pol");
		username = request.getParameter("username");
		password = request.getParameter("password");

		UserDao dao = new UserDaoImp();
		//User user = new User();

		Service service = new Service();
		boolean ok = service.authenticate2(username);
		//boolean ok2 = service.imePrezime(ime, prezime);

		if (!ok) {
			dao.addUser(ime, prezime, telefon, adresa, email, rodjenje, pol, username, password);
			//user = dao.getUser(username);
			//request.getSession().setAttribute("user", user);
			response.sendRedirect("welcome.jsp");
			//RequestDispatcher dis = request.getRequestDispatcher("userpage.jsp");
			//dis.forward(request, response);
		} else {
			response.sendRedirect("welcome.jsp");
		}
	}
}
