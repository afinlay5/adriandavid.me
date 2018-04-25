package me.adriandavid;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("Servlet has been called.");
		
		final java.io.Writer writer = response.getWriter();
		writer.append("<html>");
		writer.append("<title>Adrian D. Finlay | Java EE Homepage</title>");
		writer.append("<body> <h1>Hello Servlet!!</h1> </body>");
		writer.append("</html>");
	}
}