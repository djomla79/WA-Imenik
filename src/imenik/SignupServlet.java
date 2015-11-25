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
		ime = ime.substring(0,1).toUpperCase() + ime.substring(1, ime.length()).toLowerCase();
		prezime = prezime.substring(0,1).toUpperCase() + prezime.substring(1, prezime.length()).toLowerCase();
		adresa = adresa.substring(0,1).toUpperCase() + adresa.substring(1, adresa.length()).toLowerCase();
		pol = pol.substring(0,1).toUpperCase() + pol.substring(1, pol.length()).toLowerCase();
		username = username.toLowerCase();

		UserDao dao = new UserDaoImp();

		Service service = new Service();
		boolean ok = service.authenticate2(username);

		if (!ok) {
			dao.addUser(ime, prezime, telefon, adresa, email, rodjenje, pol, username, password);
			request.setAttribute("message", "Cestitamo, uspjesno ste napravili svoj nalog.");
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		} else {
			request.setAttribute("message1", "Zao nam je, pokusajte ponovo.");
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
	}
}
