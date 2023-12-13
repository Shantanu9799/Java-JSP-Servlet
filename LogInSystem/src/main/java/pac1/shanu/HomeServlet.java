package pac1.shanu;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class HomeServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException { 
		// collecting the email and password by request object
		String email = req.getParameter("email");
		String psw = req.getParameter("psw");
//		System.out.println(email + " " + psw);
		
		// Session Management
		//getting session
		HttpSession session = req.getSession();
		// setting all the attributes
		session.setAttribute("email", email);
		session.setAttribute("psw", psw);
		
		// redirected to another servlet for checking
		res.sendRedirect("Login");
	}

}
