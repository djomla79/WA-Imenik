package imenik;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogOutServlet
 */
@WebServlet("/LogOutServlet")
public class LogOutServlet extends HttpServlet implements ServletContextListener {
	private static final long serialVersionUID = 1L;
	
	 /** Default constructor (empty) */
    public LogOutServlet() {
    }
    
    ServletContext context;

    /** Methods from the ServletContextListener */
    @Override
	public void contextInitialized(ServletContextEvent sc) {
		//context = sc.getServletContext();
	}
    /** Method to destroy ServletContext object */
	@Override
	public void contextDestroyed(ServletContextEvent sc) {
		context = sc.getServletContext();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/** Create object HttpSession */
		HttpSession session = request.getSession();
		
		/** Call the method invalidate() to end the session */
		session.invalidate();
		
		/** Send message to welcome.jsp */
		request.setAttribute("message", "Uspjesno ste se izlogovali.");
		request.getRequestDispatcher("welcome.jsp").forward(request, response);
		
	}

}
