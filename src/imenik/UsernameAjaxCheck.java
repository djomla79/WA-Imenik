package imenik;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UsernameAjaxCheck
 */
@WebServlet("/UsernameAjaxCheck")
public class UsernameAjaxCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/** Get a parameter */
		String username = request.getParameter("username");
		
		Service service = new Service();
		
		/** Check if user with this username is in the DB */
		boolean ok = service.authenticate2(username);
		
		if (ok) { // if user exists in the DB, send this response
			response.getWriter().write("<span style='color: red'>Greska, ovaj username se vec koristi.</span>");
		} else {  // if user doesn't exists in the DB, send this response
			response.getWriter().write("<span style='color: green'>Uspjesno ste izabrali username.</span>");
		}
		
	}

}
