package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BMICalculator;

/**
 * Servlet implementation class CalcWeightServlet
 */
@WebServlet("/CalcWeightServlet")
public class calcWeightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calcWeightServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String height = request.getParameter("height");
		String bmi = request.getParameter("bmi");
		
		BMICalculator calc = new BMICalculator();
		//calc.setHeight(Double.parseDouble(height));
		//calc.setWeight(Double.parseDouble(weight));
		calc.setHeight(Integer.parseInt(height));
		calc.setBmi(Integer.parseInt(bmi));
		calc.calcWeight(); 
		
		//Display results
		request.setAttribute("calcResults", calc);
		getServletContext().getRequestDispatcher("/results.jsp").forward(request, response);
	}

}
