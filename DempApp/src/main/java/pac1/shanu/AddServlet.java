package pac1.shanu;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet
{
	/*
	 *  to handle both doGet / doPost request
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		PrintWriter out = res.getWriter();
		
		out.println("The sum " + i + " and " + j + " is " + k);
		
	}*/
	
	/*
	//  only for post request
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		PrintWriter out = res.getWriter();
		
		out.println("The sum " + i + " and " + j + " is " + k);
		
	}
	*/
	
	//  only for get request
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		k *= k;
		
		/*
		 * Request Dispatcher
		 * Redirect
		 * */
		
		// Request Dispatcher
		/*
		// set attribute as key value pair
		req.setAttribute("k", k);	
		
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
		*/
		
		// Send Redirect
//		res.sendRedirect("sq");
//		res.sendRedirect("sq?k="+k);
		
		/*
		// session management
		HttpSession session = req.getSession();
		session.setAttribute("k", k);
		res.sendRedirect("sq");
		*/
		
		// Cookie
		Cookie cookie = new Cookie("k",k+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
		
	}
	
}
