package learn.basic.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/form"})
public class ClassForm extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter printWriter = resp.getWriter();
		
		printWriter.println("<form action='/BaseServlet/test-config' method='POST'>");
		printWriter.println("ten : <input type='text' name='name'>");
		printWriter.println("tuoi : <input type='text' name='age'>");
		printWriter.println("dia chi : <input type='text' name='address'>");
		printWriter.println("<input type='submit' value='Submit'>");
		printWriter.println("</form>");
		
		printWriter.close();
	}
}
