package pac1.shanu;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class squareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		/*
		int k = (int) req.getAttribute("k");
		
		PrintWriter out = res.getWriter();
		
		out.println("Hello form Square Servlet, The Value of K is " + k);
		*/
		
		/*
		System.out.println("SQ Servlet Called");
		int k = Integer.parseInt(req.getParameter("k"));
		
		PrintWriter out = res.getWriter();
		out.println("The Value of K is " + k);
		*/
		
		/* Session 
		HttpSession session = req.getSession();
		int k = (int) session.getAttribute("k");
		PrintWriter out = res.getWriter();
		out.println("The Value of K is " + k);
		*/
		
		int k = 0;
		
		Cookie cookies[]= req.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		PrintWriter out = res.getWriter();
		out.println("The Value of K is " + k);
		
		
		
		
	}
	
}
