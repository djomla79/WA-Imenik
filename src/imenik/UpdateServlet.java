package imenik;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ime, prezime, telefon, adresa, email, rodjenje, pol, username, password;
		UserDao dao = new UserDaoImp();
		User user = new User();
		
		ime = request.getParameter("ime");
		prezime = request.getParameter("prezime");
		telefon = request.getParameter("telefon");
		adresa = request.getParameter("adresa");
		email = request.getParameter("email");
		rodjenje = request.getParameter("rodjenje");
		pol = request.getParameter("pol");
		username = request.getParameter("username");
		password = request.getParameter("password");
		
			try {
			    
				user.setIme(ime);
				user.setPrezime(prezime);
				user.setTelefon(telefon);
				user.setAdresa(adresa);
				user.setEmail(email);
				user.setRodjenje(rodjenje);
				user.setPol(pol);
				user.setUsername(username);
				user.setPassword(password);
				dao.updateUser(user);
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			request.setAttribute("user", user);
			request.getRequestDispatcher("userupdated.jsp").forward(request, response);
		
	}
}
