package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Model;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	 private static final long serialVersionUID = 1L;
	 
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        Model model = new Model();
	        double dividendo = Double.parseDouble(request.getParameter("dividendo"));
	        double divisor = Double.parseDouble(request.getParameter("divisor"));
	        try {
	            double result = model.dividir(dividendo, divisor);
	            request.setAttribute("resultMessage", "O resultado da divisão é: " + result);
	        } catch (ArithmeticException e) {
	            request.setAttribute("errorMessage", e.getMessage());
	        }
	        request.getRequestDispatcher("form.jsp").forward(request, response);
	    }
	}
	


