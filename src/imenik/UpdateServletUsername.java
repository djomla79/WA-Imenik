package imenik;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServletUsername
 */
@WebServlet("/UpdateServletUsername")
public class UpdateServletUsername extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		
		try {
			
			UserDao dao = new UserDaoImp();
			
			Service service = new Service();
			
			boolean ok = service.authenticate2(username);
			
			if (ok) {
				User user = dao.getUser(username);
				request.setAttribute("user", user);
				request.getRequestDispatcher("updatinguser.jsp").forward(request, response);
			} else {
				request.setAttribute("message", "Korisnik pod korisnickim imenom '" + username + "' se ne nalazi u bazi.");
				request.getRequestDispatcher("updateuser.jsp").forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
