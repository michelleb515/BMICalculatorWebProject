package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getBMIServlet
 */
@WebServlet("/getBMIServlet")
public class getBMIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public getBMIServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		String calcType = request.getParameter("calcType");

		//PrintWriter writer = response.getWriter();
		// writer.println(calcType.toString());
		//writer.println("You selected " + calcType.toString());
		//writer.close();

		// Based on user's selection, go to appropriate JSP
		if (calcType.equals("bmi")) {
			// go to bmi JSP
			getServletContext().getRequestDispatcher("/calcbmi.jsp").forward(request, response);
		} else {
			// go to weight JSP
			getServletContext().getRequestDispatcher("/calcweight.jsp").forward(request, response);
		}

	}

}
