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
		
		String username = request.getParameter("username");
		
		Service service = new Service();
		
		boolean ok = service.authenticate2(username);
		
		if (ok) {
			response.getWriter().write("<span style='color: red'>Greska, ovaj username se vec koristi.</span>");
		} else {
			response.getWriter().write("<span style='color: green'>Uspjesno ste izabrali username.</span>");
		}
		
	}

}
