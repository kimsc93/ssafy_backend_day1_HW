package com.ssafy;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class mainServlet
 */
@WebServlet("/mainServlet")
public class mainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String content = request.getParameter("content");
		StringBuilder sb = new StringBuilder(); 
		sb.append("<table border='1'><th>name</th><th>price</th><th>content</th>");
		sb.append("<tr>");
		sb.append("<td>"+ name +"</td>");
		sb.append("<td>"+ price +"</td>");
		sb.append("<td>"+ content +"</td>");
		sb.append("</tr>");
		response.getWriter().append(sb.toString());
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
}
