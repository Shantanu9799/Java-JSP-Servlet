package pac1.shanu;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;
import pac1.shanu.db.LoginRepo;

import java.io.IOException;
import java.io.PrintWriter;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
    public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String psw = request.getParameter("psw");
		
		LoginRepo repo = new LoginRepo();
		
		
//		if(repo.check(name, psw)) {
//			HttpSession session = request.getSession();
//			session.setAttribute("name", name);
//			response.sendRedirect("welcome.jsp");
//		} else {
//			response.sendRedirect("login.jsp");
//		}
		
		
		
			try {
				
				if(repo.check(name, psw)) {
					HttpSession session = request.getSession();
					session.setAttribute("name", name);
					response.sendRedirect("welcome.jsp");
				} else {
					response.sendRedirect("login.jsp");
				}
			} catch (ClassNotFoundException e) {

				response.sendRedirect("notfound.html");
			} 

	}

}
