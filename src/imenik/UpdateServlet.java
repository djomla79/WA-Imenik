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
		
		/** Get all parameters */
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
		
		Service service = new Service();
		/** Check if user with this username is in the DB */
		boolean ok = service.authenticate2(username);
		
		if (ok) { // if user is in the DB, set all new parameters to user (update user)
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
			      // send message that user is successfully updated to userupdated.jsp
			request.setAttribute("message", "Korisnik " + ime + " " + prezime + " uspjesno update-ovan.");
			request.getRequestDispatcher("userupdated.jsp").forward(request, response);
		} else {  // if user isn't in the DB, send message to userupdated.jsp
			request.setAttribute("message1", "Korisnik " + ime + " " + prezime + " nije update-ovan.");
			request.getRequestDispatcher("userupdated.jsp").forward(request, response);
		}
	}
}
