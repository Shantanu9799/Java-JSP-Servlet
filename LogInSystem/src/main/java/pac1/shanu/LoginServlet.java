package pac1.shanu;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		// create session 
		HttpSession session = req.getSession();
		
		// collect the parameters
		String email = (String) session.getAttribute("email");
		String psw = (String) session.getAttribute("psw");
		
		PrintWriter out = res.getWriter();
		
		// putting condition
		if((email.equals("cshantanu712@gmail.com") && psw.equals("Shanu@9775")) || (email.equals("dummy@damn.com") && psw.equals("123456789"))) {
			// out.println("Logged in SUCCESSFULLY!!!");
			res.sendRedirect("home.html");
		} else {
			res.sendRedirect("error.html");
		}
		
	}

}
