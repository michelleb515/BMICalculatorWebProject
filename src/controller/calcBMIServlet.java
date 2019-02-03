package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BMICalculator;

/**
 * Servlet implementation class CalcBMIServlet
 */
@WebServlet("/CalcBMIServlet")
public class calcBMIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calcBMIServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String height = request.getParameter("height");
		String weight = request.getParameter("weight");
		
		BMICalculator calc = new BMICalculator();
		//calc.setHeight(Double.parseDouble(height));
		//calc.setWeight(Double.parseDouble(weight));
		calc.setHeight(Integer.parseInt(height));
		calc.setWeight(Integer.parseInt(weight));
		calc.calcBMI(); 
		
		//Display results
		request.setAttribute("calcResults", calc);
		getServletContext().getRequestDispatcher("/results.jsp").forward(request, response);
	}

}
