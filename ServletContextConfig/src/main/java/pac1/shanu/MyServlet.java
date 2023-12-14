package pac1.shanu;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.print("Hi ");
		
		/*
		ServletContext ctx = getServletContext();
		
		String name = ctx.getInitParameter("name");
		String phone = ctx.getInitParameter("phone");
		*/
		
		ServletConfig cg = getServletConfig();
		String name = cg.getInitParameter("name");
		String phone = cg.getInitParameter("phone");
		
		out.print(name +", You're currently using " + phone + " phone");
		
	}


}
