package sit.int202.exam.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.exam.model.Calculator;

import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/ResultCal")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        String operator = request.getParameter("operator");
        Calculator calculator = new Calculator(Double.parseDouble(num1), Double.parseDouble(num2), operator);
        double result = calculator.checkOperatorAndResult();
        String regression = calculator.changeOperatorToRegression();
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("operator", regression);
        request.setAttribute("result", result);
        log(num1 + " " + regression + " " + num2 + " = " + result);
        request.getRequestDispatcher("/Result.jsp").forward(request, response);
    }
}
